package pkg1;

import java.util.HashSet;

public class CollectionHashSet {

	public static void main(String[] args) {
		
		//HashSet is unordered ,remove duplicate and can store only 1 null value

		HashSet<String> hs= new HashSet<String>();
		hs.add("Rajni");
		hs.add("Garg");
		hs.add("Lovish");
		hs.add("Ojas");
		hs.add("Singla");
		hs.add("Ojas");
		hs.add(null);
		
		System.out.println(hs);
		
		for(String i:hs)
		{
		System.out.println(i);
		}
	}

}
