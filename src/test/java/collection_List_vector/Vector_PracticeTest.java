package collection_List_vector;

import java.util.Arrays;
import java.util.Vector;

public class Vector_PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v1= new Vector();  //vector default capacity 10
//Vector v2= new Vector(20);  // we can definen the size of the vector
Object[] arr = new Object[] {1,3,4,5,6};
Vector v2= new Vector(Arrays.asList(arr));
System.out.println(v2);
//v1.add("Kalpana");
//v1.add("Nayna");
//v1.add("Girija");

Object[] arr2 = v1.toArray();
//System.out.println(Arrays.toString(arr) );
System.out.println(Arrays.toString(arr2) );
//Vector v2 = new Vector();
//v2.add("shriya");
//v2.add("tanu");
//v2.add("pinky");
//v2.add("bhavyaS");



//for (int i = 0; i < v2.size(); i++) {
//	v1.add(v2.get(i));
//	
//}
//v1.addAll(0, v2);


//System.out.println(v1);
System.out.println(v2.size());
//System.out.println(v1.capacity());
	}

}
