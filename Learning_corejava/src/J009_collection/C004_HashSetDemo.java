package J009_collection;

import java.util.HashSet;
import java.util.Iterator;

public class C004_HashSetDemo {
	public static void main(String[] args) {
		
		//default = 16
		//load factor : 0.75
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("SQL");
		set.add("Java");
		set.add("Oracle");
		set.add(null);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
