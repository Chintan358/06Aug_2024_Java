package J010_thread;

class Sample extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
//			try {
//				this.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(this.currentThread().getName()+" "+i);
		}
	}
}

public class T003_Thread {
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		
		s1.start();
		
		s2.start();
		try {
			s1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s3.start();
	}
}
