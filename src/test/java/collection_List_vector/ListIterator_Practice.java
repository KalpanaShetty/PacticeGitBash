package collection_List_vector;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1= new ArrayList<>();
		al1.add(1);
		al1.add(1);
		al1.add(null);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		System.out.println(al1);
		ListIterator<Integer> li = al1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.add(45);
		System.out.println(al1);
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.remove();
		System.out.println(al1);
	}

}
