package pkg1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionLinkedHashMap {

	public static void main(String[] args) {
		//LinkedHashMap is ordered ,replace duplicate and store 1 null key and any no. of null value
		
				LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
				hm.put(1,"Rajni");
				hm.put(22,"Garg");
				hm.put(44,"Lovish");
				hm.put(23,"Ojas");
				hm.put(55,"Singla");
				hm.put(62,"Ojas");
				hm.put(44,"Ojee");
				hm.put(77,null );
				hm.put(99,null);
				hm.put(null,"Karan");
				hm.put(null, "parkash");
				
				Set<Integer> allkeys=hm.keySet(); 
				
				for(Integer i:allkeys)
				{
				System.out.println("key is"+i);
				System.out.println("Value is"+hm.get(i));
				}
	}

}
