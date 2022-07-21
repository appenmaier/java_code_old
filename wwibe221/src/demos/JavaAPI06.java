package demos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Assoziativspeicher (Maps)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaAPI06 {

	public static void main(String[] args) {

		HashMap<String, Double> grades = new HashMap<>();
//		TreeMap<String, Double> grades = new TreeMap<>();

		grades.put("9182745", 2.4);
		grades.put("1726485", 2.1);
		grades.put("7264895", 4.4);
		grades.put("1127395", 1.0);
		grades.put("8826321", 2.4);
		grades.put("8826321", 2.3);

		System.out.println(grades.get("7264895"));

		Set<Entry<String, Double>> entries = grades.entrySet();
		Set<String> keys = grades.keySet();
		Collection<Double> values = grades.values();

		System.out.println(grades);
		System.out.println(entries);
		System.out.println(keys);
		System.out.println(values);

		for (Entry<String, Double> entry : grades.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		for (String s : grades.keySet()) {
			System.out.println(s);
		}

		for (Double d : grades.values()) {
			System.out.println(d);
		}

	}

}
