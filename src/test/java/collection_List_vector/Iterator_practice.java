package collection_List_vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Iterator_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vector<String> v = new Vector<>();
//		
//		v.add("Banana");
//		v.add("cheery");
//		v.add("apple");
//		
//		Iterator<String> i = v.iterator();
//		i.hashCode();
//		i.next();
//		while (i.hasNext()) {
//			i.next();
//			i.remove();	
//		}
//		System.out.println(v);
		HashMap<Integer, String> m = new HashMap<>();
		m.put(500050, "Hydrabad");
		m.put(601369, "Chennai");
		m.put(123658, "Delhi");
		System.out.println(m);
		Iterator<Integer> values = m.keySet().iterator();
		while (values.hasNext()) {
	 values.next();
			
		}
		
	}

}
