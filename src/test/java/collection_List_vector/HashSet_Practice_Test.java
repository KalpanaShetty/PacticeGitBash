package collection_List_vector;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Practice_Test {

	public static void main(String[] args) {
		//HashSet<Integer> hs= new HashSet<>();
		LinkedHashSet<Integer> hs= new LinkedHashSet<>();
	//	System.out.println(hs);
		hs.add(52);
		hs.add(12);
		hs.add(82);
		hs.add(42);
		hs.add(22);
		hs.add(32);
		hs.add(62);
		//hs.clear();
		System.out.println(hs.size());
	System.out.println(hs);System.out.println(hs.isEmpty());
//		System.out.println(hs.remove(42));
//		System.out.println(hs.contains(32));
		
//		for (Integer element : hs) {
//			System.out.println(element);
//			
//		}

	}

}
