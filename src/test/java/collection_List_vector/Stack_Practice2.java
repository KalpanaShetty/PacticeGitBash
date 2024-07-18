package collection_List_vector;

import java.util.Stack;

public class Stack_Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> books= new Stack<>();
		
//		books.add("red");  // first one
//		books.add("black");
//		books.add("white"); //last one
		books.push("red");  // first one
		books.push("black");
		books.push(null);
		books.push("white"); //last one
		
		//System.out.println(books.search("red")); // it will count from the top
//		System.out.println(books.peek());  //it will give the element available in the peek
		//System.out.println(books.isEmpty());
		
		//System.out.println(books.pop());
		System.out.println(books);
	}

}
