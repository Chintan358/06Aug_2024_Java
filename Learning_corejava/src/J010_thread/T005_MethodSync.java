package J010_thread;

class Maths
{
	synchronized public void table(int num)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+(i*num));
		}
	}
}


class Calc extends Thread
{
	Maths m;
	Calc(Maths m)
	{
		this.m = m;
	}
	
	@Override
	public void run() {
		m.table(7);
	}
}


public class T005_MethodSync {
	public static void main(String[] args) {
		
		
		Maths m = new Maths();
		
		Calc c  =new Calc(m);
		Calc c1 = new Calc(m);
		Calc c3 = new Calc(m);
		
		c.start();
		c1.start();
		c3.start();
		
	}
}
