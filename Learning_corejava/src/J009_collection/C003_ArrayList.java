package J009_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C003_ArrayList {
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Rishabh");
		al.add(23.66);
		al.add('A');
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
		
//		for(Object o : al)
//		{
//			System.out.println(o);
//		}
		
	
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		
	}
}
