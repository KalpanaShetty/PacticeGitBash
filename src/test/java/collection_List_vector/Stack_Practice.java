package collection_List_vector;

import java.util.Stack;

public class Stack_Practice {

	public static void main(String[] args) {
		/*
		 * LIFO-- last in first out--stack
		 * FIFO-- first in first out--queue
		 */
		
		//stack is class in java which implements the list interface and extends vector class and follows LIFO
//Stack is always created with empty stack
		Stack<String> books= new Stack<>();
		books.add("black");
		books.add(0, "white");
		books.add("red");
		System.out.println(books);
		books.remove(0);
		System.out.println(books);
		books.add(0, "white");
		System.out.println(books);
		books.set(0, "yellow");
		System.out.println(books);
		
		System.out.println(books.contains("yellow"));
		
		//special method push pop peak search
		
		
	}

}
