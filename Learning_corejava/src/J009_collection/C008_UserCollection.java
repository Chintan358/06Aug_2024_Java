package J009_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C008_UserCollection {
	public static void main(String[] args) {
		
		ArrayList<Demo> al = new ArrayList<Demo>();
		al.add(new Demo(10, "Sujal", "abc@gmial.com"));
		al.add(new Demo(5, "Pramod", "test@gmail.com"));
		al.add(new Demo(7, "Rishabh", "tech@gmial.com"));
		al.add(new Demo(12, "Krishna", "xyz@gmail.com"));
		
		
//		Collections.sort(al,new SortById());
		Collections.sort(al,new SortByName());
		Iterator<Demo> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		
		
		
	}
}
