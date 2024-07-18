package collection_List_vector;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts= new TreeSet();
		//	System.out.println(hs);
			ts.add(52);
			ts.add(12);
			ts.add(82);
			ts.add(42);
			ts.add(22);
			ts.add(32);
			ts.add(62);
			System.out.println(ts);
			ts.descendingSet();
			//System.out.println(ts.descendingSet());
			System.out.println(ts.first());
//			System.out.println(ts.first());
//			System.out.println(ts.last());
//			System.out.println(ts.pollFirst()); //removes
//			System.out.println(ts.pollLast());
			//System.out.println(ts.subSet(10, 50));
			//System.out.println(ts.subSet(10, 50).remove(22));// subset creates virtual set,It will not disturb the main set
			
	}

}
