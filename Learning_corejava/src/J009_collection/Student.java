package J009_collection;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	String email;
	int age;
	
	public Student(int id, String name, String email, int age) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+age);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
	
//		//10 35 30
//		//10 30 35
//		int current = this.id; //30
//		int exist = o.id;   //10
//		
//		int i = 0;
//		
//		if(current>exist)
//		{
//			i = -1;
//		}
//		else if(current<exist)
//		{
//			i = 1;
//		}
//		else
//		{
//			i = 0;
//		}
//		
//		
//		
//		return i;
		
		
		String current = this.name;
		String exist = o.name;
		
		return -current.compareTo(exist);
		
	}
	
	

}
