package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> tm=new HashMap<String,Double>();
		System.out.println("size of the hashmap is:"+tm.size());
		tm.put("john",100.7);
		tm.put("Joe	", 1450.78);
		tm.put("sowndariya", 150.45);
		System.out.println("Elements in the hashmapset:"+tm);
		System.out.println("size of the hashmap is:"+tm.size());
		Set<Map.Entry<String,Double>>set=tm.entrySet();
		for(Map.Entry<String,Double>me:set) {
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		

	}

}