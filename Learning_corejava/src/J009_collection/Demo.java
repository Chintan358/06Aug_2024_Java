package J009_collection;

public class Demo {
	
	int id;
	String name;
	String email;
	
	public Demo(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}
