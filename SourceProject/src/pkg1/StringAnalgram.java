
package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnalgram {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String1");
		String s1=scan.nextLine();
		System.out.println("Enter String2");
		String s2=scan.nextLine();
		boolean status=false;
		if(s1.length()==s2.length())
		{
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			status=Arrays.equals(c1, c2);
		}
		if(status==true)
		{
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

}
