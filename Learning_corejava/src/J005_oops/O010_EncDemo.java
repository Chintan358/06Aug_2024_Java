package J005_oops;

public class O010_EncDemo {
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setId(10);
		e.setName("Pramod");
		e.setSal(50000);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	}
}
