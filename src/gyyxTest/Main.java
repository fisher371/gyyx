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
//		System.out.println("hello "+a);
		char[] input=a.toCharArray();
		Vector<Character> res=new Vector<Character>();
		for(int i=0;i<a.length();i++){
			Vector<Character> vector=new Vector<Character>();
			boolean flag=true;
			for(Character c:vector){
				if(c==input[i]){
					flag=false;
					break;
				}
			}
			if(flag){
				vector.add(input[i]);
			}
			else {
				if(vector.size()>res.size())
				{
					res=new Vector<Character>();
					for(Character character : vector)
						res.add(character);
				}
			}
		}
		for (Character character : res) {
			System.out.print(character);
		}
	}

}
