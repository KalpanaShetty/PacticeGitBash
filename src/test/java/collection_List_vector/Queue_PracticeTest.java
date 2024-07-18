package collection_List_vector;

import java.util.*;

public class Queue_PracticeTest {

	public static void main(String[] args) {
		//priority queue
		//PriorityQueue<Integer> pq= new PriorityQueue<>();
		//Queue<Integer> q= new PriorityQueue<>();
 //Addition-->offer or ADD
//		pq.offer(5);
//		pq.add(8);
//		pq.offer(1);
//		pq.add(7);
//		pq.clear();
//		for (Integer integer : pq) {
//			System.out.println(integer);
//		}// dont use foreach incase of pq
//		
//		while (!pq.isEmpty()) {
//			
//			System.out.println(pq.poll());
//		}//better to use while loop
		//System.out.println(pq.contains(5));
		
		
		//System.out.println(pq);
		//retrivel--peek--only head elemnt can be retrived
		//System.out.println(pq.peek());
		//System.out.println(pq);
		//System.out.println(pq.poll());
		//System.out.println(pq);
		//removal---poll, remove
		//generally lowest int will have 1st priority incase if we want to give 1st priority to higest int we have to use comparator
		PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(5);
		pq.add(8);
		pq.offer(1);
		pq.add(7);
		System.out.println(pq);
		while (!pq.isEmpty()) {
			
			System.out.println(pq.poll());
		}
		
		
		
		
		
	}

}
