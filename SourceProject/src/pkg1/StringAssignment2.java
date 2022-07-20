package pkg1;

import java.util.Scanner;

public class StringAssignment2 {
	
		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any String");
			String s=scan.nextLine();
			String[] s1=s.split(" ");
			int length=s1.length;
			String result="";
			for(int i=length-1;i>=0;i--)
			{
				result=result+s1[i]+" ";
			}
			System.out.println(result);
		}

}
