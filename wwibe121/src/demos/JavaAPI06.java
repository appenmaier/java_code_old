package demos;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Assoziativspeicher (Maps)
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JavaAPI06 {

	public static void main(String[] args) {

//		HashMap<String, Double> grades = new HashMap<>();
		TreeMap<String, Double> grades = new TreeMap<>();

		grades.put("1827465", 2.5);
		grades.put("9182733", 4.1);
		grades.put("8192843", 1.0);
		grades.put("5437345", 2.5);
		grades.put("6617284", 3.0);
		grades.put("9182218", 2.6);
		grades.put("9182218", 2.5);

		System.out.println(grades.get("5437345"));

		Set<Entry<String, Double>> entries = grades.entrySet();
		Set<String> keys = grades.keySet();
		Collection<Double> values = grades.values();

		System.out.println(grades);
		System.out.println(entries);
		System.out.println(keys);
		System.out.println(values);

		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
