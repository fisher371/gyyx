package gyyxTest;

import java.util.Scanner;

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
		System.out.println("hello "+a);
	}

}
