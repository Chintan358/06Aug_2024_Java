package J009_collection;

public class Student {
	
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
	
	

}
