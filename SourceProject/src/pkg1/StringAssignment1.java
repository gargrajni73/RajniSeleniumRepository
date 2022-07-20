package pkg1;

import java.util.Scanner;

public class StringAssignment1 {

	//String is Palindrome or not or Reverse a String
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=scan.next();
		int length=s.length();
		String result="";
		for(int i=length-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		if(s.equals(result))
		{
			System.out.println("Strings are Palindrome");
		}
		else
		{
			System.out.println("Strings are not Palindrome");
		}

	}

}
