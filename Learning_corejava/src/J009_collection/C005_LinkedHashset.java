package J009_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C005_LinkedHashset {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
