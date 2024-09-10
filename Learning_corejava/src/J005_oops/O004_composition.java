package J005_oops;

class Sample {
	public void display() {
		System.out.println("Runing diplsay");
	}

}

class Run {
	static Sample sample = new Sample();

	public void print() {
		System.out.println("Ruinnig print");
	}

}

public class O004_composition {
	public static void main(String[] args) {

		Run.sample.display();

		System.out.println();

	}
}
