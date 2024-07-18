package collection_List_vector;

import java.util.*;

public class LinkedList_Practice {

	public static void main(String[] args) {
	//	LinkedList<Integer> ll = new LinkedList<>();
		//List<Integer> ll = new LinkedList<>(); // when we create like this we can perform only list methods here
		//Queue<Integer> ll = new LinkedList<>();
		//Deque<Integer> ll = new LinkedList<>();
		//Iterable<Integer> ll = new LinkedList<>();
		
		
		ArrayList<String> al= new ArrayList();
		al.add("r3");
		al.add("s2");
		LinkedList<String> ll = new LinkedList<>(); // 2 ways we can create 1.empty linkedlist 2.create with data
		//we cant create linkedlist by passing size(predefined size) bcz all elements are objects  
		
		ll.add("y1");
		ll.add("d2");
		ll.addAll(al);
		System.out.println(ll);
		System.out.println(ll.getFirst()); 
		ll.get(2);
		ll.set(2, "ss");
//		ll.remove();
		System.out.println(ll);
//		ll.remove(2);
//		System.out.println(ll);
	
	}

}
