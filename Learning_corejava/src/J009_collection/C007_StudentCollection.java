package J009_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class C007_StudentCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10, "Sujal", "sujal@gmail.com", 25));
		al.add(new Student(35, "Pramod", "pramod@gmail.com", 26));
		al.add(new Student(30, "Rishbh", "rishbh@gmail.com", 23));
		
		Collections.sort(al);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
