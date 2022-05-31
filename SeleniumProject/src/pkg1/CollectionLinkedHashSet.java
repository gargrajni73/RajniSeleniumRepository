package pkg1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
		
		//LinkedHashSet in ordered ,remove duplicate and not store null values
		
		LinkedHashSet<String> hs= new LinkedHashSet<String>();
		hs.add("Rajni");
		hs.add("Garg");
		hs.add("Lovish");
		hs.add("Ojas");
		hs.add("Singla");
		hs.add("Ojas");
		
		for(String i:hs)
		{
		System.out.println(i);
		}

	}

}
