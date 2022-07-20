package pkg1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionHashMap {

	public static void main(String[] args) {
		
		//HashMap is unordered ,replace duplicate and store 1 null key and any no. of null value
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1,"Rajni");
		hm.put(22,"Garg");
		hm.put(44,"Lovish");
		hm.put(23,"Ojas");
		hm.put(55,"Singla");
		hm.put(55,"Singla"); //Nothing happens
		hm.put(62,"Ojas");
		hm.put(44,"Ojee");
		hm.put(77,null );
		hm.put(99,null);
		hm.put(null,"Karan");
		hm.put(null, "parkash");
		
		Set<Integer> allkeys=hm.keySet(); //keySet method will give you all the keys of that map
		
		for(Integer i:allkeys)
		{
		System.out.println("key is"+i);
		System.out.println("Value is"+hm.get(i));
		}
	}

}
