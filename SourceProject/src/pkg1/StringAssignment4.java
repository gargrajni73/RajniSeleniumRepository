package pkg1;

import java.util.Scanner;

public class StringAssignment4 {
	
		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any String");
			String s=scan.nextLine();
			String[] s1=s.split(" ");
			int length=s1.length;
			for(int i=length-1;i>=0;i--)
			{
				int length1=s1[i].length();
			for(int j=length1-1;j>=0;j--)
			{
				System.out.print(s1[i].charAt(j));
			}
				System.out.print(" ");
			}
}
}
