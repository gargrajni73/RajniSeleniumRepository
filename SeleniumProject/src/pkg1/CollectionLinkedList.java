package pkg1;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		
		//LinkedList is ordered ,allow duplicate and store null values
		LinkedList<String> hs= new LinkedList<String>();
		hs.add("Rajni");
		hs.add("Garg");
		hs.add("Lovish");
		hs.add("Ojas");
		hs.add("Singla");
		hs.add("Ojas");
		hs.add(null);
		hs.add(null);
		
		for(String i:hs)
		{
		System.out.println(i);
		}


	}

}
