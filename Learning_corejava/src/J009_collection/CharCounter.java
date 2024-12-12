package J009_collection;

import java.util.HashMap;

public class CharCounter {
	public static void main(String[] args) {
		
		
		String str = "Hello java Hello Tops Hello java";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(map.get(ch[i])==null)
			{
				map.put(ch[i], 1);
			}
			else
			{
				int k = map.get(ch[i]);
				k++;
				map.put(ch[i], k);
			}
		}
		
		System.out.println(map);
		
	}
}
