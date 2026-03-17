package collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<>();

		System.out.println("size of the treemap is:" + tm.size());

		tm.put("John Doe", 100.7);
		tm.put("Tom smith", 1450.78);
		tm.put("Jane baker", 150.45);
		tm.put("Raiph Smith", 150.45);

		System.out.println("Elements in the treemap:" + tm);

		System.out.println("size of the treemap is:" + tm.size());

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}

}