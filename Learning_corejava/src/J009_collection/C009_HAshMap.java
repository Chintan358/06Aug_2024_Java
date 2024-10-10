package J009_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class C009_HAshMap {
	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Java");
		map.put(20, "PHP");
		map.put(30, "Android");
		map.put(40, "SQL");
		map.put(10, "ORacle");
		map.put(15, "ORacle");
		
		//System.out.println(map.get(15));
		//System.out.println(map);
		
//		Set s = map.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		for(Entry<Integer, String> m : map.entrySet() )
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
}
