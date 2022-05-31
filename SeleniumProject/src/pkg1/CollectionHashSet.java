package pkg1;

import java.util.HashSet;

public class CollectionHashSet {

	public static void main(String[] args) {
		
		//HashSet is unordered ,remove duplicate and not store null values

		HashSet<String> hs= new HashSet<String>();
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
