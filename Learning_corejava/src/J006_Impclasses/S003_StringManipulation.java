package J006_Impclasses;

public class S003_StringManipulation {
	public static void main(String[] args) {
		
		
		String str = "Sun rises in east";
		
		//east in rises sun
		//tsae ni sesir nuS
		//nuS sesir ni tsae
		//east rises in sun
		
		String words[] = str.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		System.out.println();
		System.out.println("***************");
		
		char ch[] = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		
		
	}
}
