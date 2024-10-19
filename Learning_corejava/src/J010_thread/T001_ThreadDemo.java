package J010_thread;


class Th1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.currentThread().getName()+" "+i);
		}
	}
}


class Th2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				this.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.currentThread().getName()+" "+i);
		}
	}
}


public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		t1.setName("A");
		t2.setName("B");
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t2.setPriority(Thread.NORM_PRIORITY);
//		System.out.println(t1.getName()+" "+t2.getName());
//		System.out.println(t1.getPriority()+" "+t2.getPriority());
//		System.out.println(t1.getId()+" "+t2.getId());
		
		t1.start();
		t2.start();
		
	}
}
