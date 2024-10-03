package J009_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C007_StudentCollection {
	public static void main(String[] args) {
		
		Student st = new Student(10, "Sujal", "sujal@gmail.com", 25);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(st);
		al.add(new Student(20, "Pramod", "pramod@gmail.com", 26));
		al.add(new Student(30, "Rishbh", "rishbh@gmail.com", 23));
		
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext())
		{
//			Student s = itr.next();
//			s.display();
			System.out.println(itr.next());
		}
		
		
	}
}
