package pkg1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
		
		//LinkedHashSet in ordered ,remove duplicate and can store only 1 null value
		
		LinkedHashSet<String> hs= new LinkedHashSet<String>();
		hs.add("Rajni");
		hs.add("Garg");
		hs.add("Lovish");
		hs.add("Ojas");
		hs.add("Singla");
		hs.add("Ojas");
		hs.add(null);
		
		for(String i:hs)
		{
		System.out.println(i);
		}

	}

}
