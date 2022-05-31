package pkg1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionNestedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm1= new LinkedHashMap<Integer,String>();
		hm1.put(1,"Rajni");
		hm1.put(2,"Lovish");
		hm1.put(3,"Ojas");
		
		LinkedHashMap<Integer,String> hm2= new LinkedHashMap<Integer,String>();
		hm2.put(1,"Amita");
		hm2.put(2,"Amit");
		hm2.put(3,"Sonakshi");
		hm2.put(4,"Hitashi");
		
		HashMap<String,HashMap<Integer,String>> hm3= new HashMap<String,HashMap<Integer,String>>();
		hm3.put("hm1",hm1);
		hm3.put("hm2",hm2);
		
		System.out.println(hm3.get("hm2")); //Print 1 Map
		
		Set<String> allkeys=hm3.keySet(); //keySet method will give you all the keys of that map
		
		for(String i:allkeys)
		{
		System.out.println("key is"+i);
		System.out.println("Value is"+hm3.get(i));
		}
	}

}
