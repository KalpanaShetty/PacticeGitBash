package collection_List_vector;

import java.util.*;

public class Arraydeque_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> ad= new ArrayDeque<>();
//Queue<String> ad= new ArrayDeque<>();
//addition- offer , offerfirst, offerlast, add , add first , addlast, addall
ad.add("Banana");
ad.addFirst("cherry");
ad.addLast("kivi");
ad.offer("pear");
ad.offerFirst("mango");
ad.offerLast("apple");
System.out.println(ad);
//retrival-- peek , peekfirst, peeklast,
System.out.println(ad.peek());
System.out.println(ad.peekFirst());
System.out.println(ad.peekLast());
ad.size();
ad.isEmpty();
//removal-- poll , pollfirst, polllast, remove, removefirst, removelast


	}

}
