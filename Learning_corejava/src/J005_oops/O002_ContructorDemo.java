package J005_oops;

class Student
{
	int id;
	String name;
	
//	Student()
//	{
//		System.out.println("Constructor calling");
//	}
//	
//	Student(int a)
//	{
//		System.out.println("Constructor calling"+a);
//	}
//	
//	Student(String name)
//	{
//		System.out.println("Constructor calling"+name);
//	}
	
	Student(int id, String name)
	{
		this.id  = id;
		this.name  =name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}

public class O002_ContructorDemo {

	public static void main(String[] args) {
		
		Student st = new Student(10,"Sujal");
		st.display();
		
		Student st1 = new Student(11,"Pramod");
		st1.display();
		
	}
}
