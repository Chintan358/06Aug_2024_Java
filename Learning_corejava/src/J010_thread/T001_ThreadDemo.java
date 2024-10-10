package J010_thread;

class Th1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("th1 : "+i);
		}
	}
}


class Th2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("th2 : "+i);
		}
	}
}


public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		//t1.run();
		//t2.run();
		
		t1.start();
		t2.start();
		
	}
}
