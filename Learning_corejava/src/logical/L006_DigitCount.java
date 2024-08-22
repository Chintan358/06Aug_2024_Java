package logical;

public class L006_DigitCount {
	public static void main(String[] args) {
		
		int num = 41200;
		int count = 0;
		while(num!=0)
		{
			int rem = num%10;
			//System.out.println(rem);
			num = num/10;
			//System.out.println(num);
			count++;
		}
		
		System.out.println(count);
	}
}
