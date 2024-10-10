package J009_collection;

import java.util.Comparator;

public class SortByName implements Comparator<Demo>{

	@Override
	public int compare(Demo o1, Demo o2) {
		
		String current = o1.name;
		String exist = o2.name;
		// TODO Auto-generated method stub
		return -current.compareTo(exist);
	}

}
