package collection_List_vector;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Enumeration_Practice {

	public static void main(String[] args) {
//		Vector<String> v = new Vector<>();
//		//Stack< String> v= new Stack<>();
//		v.add("Banana");
//		v.add("cheery");
//		v.add("apple");
//		System.out.println(v);
//		Enumeration<String> e = v.elements();
//e.hasMoreElements(); //returns true if elemnts available
//e.nextElement();   //it will print the available elemnt
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());		
//		}
//		Hashtable<String, Integer> ages= new Hashtable<>();
//		ages.put("India", 50);
//		ages.put("China", 40);
//		ages.put("Lanka", 30);
//		Enumeration<Integer> ele = ages.elements();  //only values it will iterate
//		while (ele.hasMoreElements()) {
//		System.out.println(ele.nextElement());		
//		}
		Properties pobj= new Properties();
		pobj.setProperty("India", "12");
		pobj.setProperty("china", "10");
		pobj.setProperty("India", "12");
		Enumeration<Object> e = pobj.elements();
		//we can eevn call iterator from here
		//Iterator<Object> e2 = pobj.elements().asIterator();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement()); 
			
		}
		
		
	}

}
