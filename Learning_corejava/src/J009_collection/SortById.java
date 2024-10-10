package J009_collection;

import java.util.Comparator;

public class SortById implements Comparator<Demo>{

	@Override
	public int compare(Demo o1, Demo o2) {
		
		int current = o1.id;
		int exist = o2.id;
		
		int i = 0;
		
		if(current>exist)
		{
			i = 1;
		}
		else if(current<exist)
		{
			i = -1;
		}
		else {
			i=0;
		}
		
		return i;
	}

}
