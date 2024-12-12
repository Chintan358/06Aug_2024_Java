package J003_statements;

public class S002_IfELese {
	public static void main(String[] args) {
		
		
		
		int a = 200;
		int b = 200;
		int c = 200;
		
		
		
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("A is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//		}
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("B is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//		}
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("all are same");
		}
	}
}
