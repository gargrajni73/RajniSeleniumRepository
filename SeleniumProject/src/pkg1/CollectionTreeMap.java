package pkg1;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class CollectionTreeMap {
	
	//TreeMap in ascending order ,replace duplicate and store null value but not null key
	
	public static void main(String[] args) {
		TreeMap<Integer,String> hm= new TreeMap<Integer,String>();
		hm.put(1,"Rajni");
		hm.put(22,"Garg");
		hm.put(44,"Lovish");
		hm.put(23,"Ojas");
		hm.put(55,"Singla");
		hm.put(62,"Ojas");
		hm.put(44,"Ojee");
		hm.put(77,null );
		hm.put(88,null );
		
		Set<Integer> allkeys=hm.keySet(); 
		
		for(Integer i:allkeys)
		{
		System.out.println("key is"+i);
		System.out.println("Value is"+hm.get(i));
		}
	}

}
