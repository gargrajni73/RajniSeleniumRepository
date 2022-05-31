package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		//ArrayList is ordered ,allow duplicate and store null values
		ArrayList<String> hs= new ArrayList<String>();
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
