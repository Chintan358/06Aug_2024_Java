package J009_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C001_ArrayList {
	
	public static void display()
	{
		
	}
	
	public static void main(String[] args) {
		
		
		
		//default size : 10
		//new size = oldsize * 3/2 +1 = 16
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("Php");
		al.add("Android");
		al.add("Java");
		//al.add(null);
		
		Collections.sort(al);
		
		//al.add(1,"SQL");
		//al.set(1, "SQL");
		//al.remove(2);
		
		//System.out.println(al.contains("Java"));
		//System.out.println(al.get(3));
		//System.out.println(al.size());
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
