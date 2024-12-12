package J009_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C006_Treeset {

	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("SQL");
		set.add("Java");
		set.add("Oracle");
		
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
