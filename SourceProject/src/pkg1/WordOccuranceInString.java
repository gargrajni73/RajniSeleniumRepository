package pkg1;

import java.util.Scanner;

public class WordOccuranceInString {

		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any String");
			String s=scan.nextLine();
			String [] s1=s.split(" ");
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(s1[i].equals("is"))
				{
					count++;
				}
			}
			System.out.println("Occurance of is:"+count);
	}

}
