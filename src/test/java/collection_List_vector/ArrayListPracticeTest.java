package collection_List_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ArrayListPracticeTest {

	public static void main(String[] args) {
	ArrayList<Integer> al1= new ArrayList<>();
	//3ways we can create arraylist  1. empty arraylist 2.specific size 3.directly take data from colection
	// when only  to store and to retrieve data array list and vector is good
	//duplicates allowed
	// null allowed 
	//insertion order allowed
	
	al1.add(1);
	al1.add(1);
	al1.add(null);
	al1.add(4);
	al1.add(5);
	al1.add(6);
	//automatic sorting not done
	 
//	al1.add(0, -1);
//	al1.add(0, 4);
//	al1.add(1, 3);
		System.out.println(al1);
//		System.out.println(al1.size());
//		
//		Integer[] arr= new Integer[] {1,2,3,4,5,6,7,8,9,10,11};
//		ArrayList<Integer> al2= new ArrayList<>(Arrays.asList(arr));
//		System.out.println(al2);
		//size will be increased 50%
		//by default not syncronised
		//Collections.synchronizedList(al2);  //this will make arraylist as syncronised 
		
//		System.out.println(al2.size());
//		System.out.println(al2.get(5));
//		al2.remove(0);
//		al2.clear();
//		al2.removeAll(al2);
//		System.out.println(al2);
	
	}

}
