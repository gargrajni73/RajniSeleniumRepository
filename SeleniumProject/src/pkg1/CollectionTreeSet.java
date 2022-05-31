package pkg1;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionTreeSet {

	public static void main(String[] args) {
		
		//TreeSet in ascending order ,remove duplicate and not store null values
		TreeSet<String> hs= new TreeSet<String>();
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
