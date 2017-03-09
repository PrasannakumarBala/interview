package hcl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "kumar");
		m1.put(2, "nani");
		m1.put(3,"chinni");
		m1.put(4, "pavan");
		
		
		
		Set s1=m1.keySet();
				
		for(Entry<Integer, String> m:m1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("------Linked Hash Map-------------");
	}

}
