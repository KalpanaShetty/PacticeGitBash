package collection_List_vector;
import java.util.*;
import java.util.Map.Entry;
public class Map_Practice_Test {

	public static void main(String[] args) {
//		Map<Integer, String> m = new Hashtable<>();
		Map<Integer, String> m = new LinkedHashMap<>();
		//Map<Integer, String> m = new HashMap<>();
		//Map<Integer, String> m = new TreeMap<>();
		m.put(500050, "Hydrabad");
		m.put(601369, "Chennai");
		m.put(123658, "Delhi");
		System.out.println(m);
//		m.clear();
//		System.out.println(m);
	//	System.out.println(m.size());
//		m.putIfAbsent(123658, "Banglore");
//		System.out.println(m);
//		m.replace(123658, "Banglore");
//		System.out.println(m);
		
//		m.put(123658, "banglore");
//		System.out.println(m);
//		System.out.println(m.containsKey(123658));
//		System.out.println(m.containsKey(12365));
//		System.out.println(m.containsValue("Chennai"));
//		System.out.println(m.containsValue("Chenna"));
//		m.remove(123658);
//		m.remove(123658, "Delhi");
//		System.out.println(m);
		//retrivel of keys
	Set<Integer> keys=m.keySet();
		for (Integer key : keys) {
			System.out.println(key);
			}
		//retrivel of values
//		Collection<String> values = m.values();
//		for (String value : values) {
//			System.out.println(value);
//		}
		//retrivel of value based on keys
//		System.out.println(m.get(123658));
//		
//		for (Integer key :  keys) {
//			System.out.println(key+"---->" + m.get(key));
		
		Set<Entry<Integer, String>> entries = m.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" ==>"+value);
			
		}
		}
		
	}


