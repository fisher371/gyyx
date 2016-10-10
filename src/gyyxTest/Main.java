package gyyxTest;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String a= scanner.nextLine();
		scanner.close();
		func(a);
	}
	static void func(String a)
	{
		int max=0;
		char[] input=a.toCharArray();
		Vector<Character> res=new Vector<Character>();
		for(int j=0;j<a.length();j++){
			Vector<Character> vector=new Vector<Character>();
			for(int i=j;i<a.length();i++){
				boolean flag=true;
				for(Character c:vector){
					if(c==input[i]){
						flag=false;
					}
				}
				if(flag&&i!=a.length()-1){
					vector.add(input[i]);
				}
				else {
					if(vector.size()>max)
					{
						res=new Vector<Character>();
						for(Character character : vector)
							res.add(character);
						max=vector.size();
					}
					break;
				}
			}
		}
		for (Character character : res) {
			System.out.print(character);
		}
		System.out.println(" "+res.size());
	}

}
