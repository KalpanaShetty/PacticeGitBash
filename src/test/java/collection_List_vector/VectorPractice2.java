package collection_List_vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Vector v1= new Vector();
//System.out.println(v1);
//
//Object[] ob= new Object[] {1,2,3,4};
//System.out.println(Arrays.toString(ob));
//v1.add(Arrays.asList(ob));
//System.out.println(v1);


//Object[] arr = new Object[] {1,3,4,5,6};
//Vector v2= new Vector(Arrays.asList(arr));
//System.out.println(v2);
//v2.add("Kalpana");
//System.out.println(v2);
//int sum = 0 ;
//for(int i = 0; i<v2.size(); i++) {
//	sum +=(Integer) v2.get(i);
//}
//System.out.println(sum);
Vector<String> v3 = new Vector<>();
v3.add(null);
v3.add("kalps");
v3.add("kalps");
v3.add("nayana");
System.err.println(v3.capacity());

}
}