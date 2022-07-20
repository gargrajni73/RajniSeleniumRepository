package pkg1;

import java.util.Scanner;

public class CharacterOccuranceInString {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=scan.nextLine();
		int length=s.length();
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(s.charAt(i)=='m')
			{
				count++;
			}
		}
		System.out.println("Occurance of m is:"+count);
	}
	}


