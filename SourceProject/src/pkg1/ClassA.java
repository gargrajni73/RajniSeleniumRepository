package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) throws IOException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=scan.nextLine();
		String[] s1=s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>(Arrays.asList(s1));
			for(String h:hs)
			{
			System.out.print(h+" ");
			}
			
	}
	}
		