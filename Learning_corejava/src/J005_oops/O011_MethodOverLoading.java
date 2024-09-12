package J005_oops;

class Calc1 {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}
}

public class O011_MethodOverLoading {
	public static void main(String[] args) {

		Calc1 c = new Calc1();
		c.add(10, 20);
		c.add(10, 20, 30);

	}

	public static void main(String args) {

		Calc1 c = new Calc1();
		c.add(10, 20);
		c.add(10, 20, 30);

	}
}
