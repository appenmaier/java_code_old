package exercises.tutego;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://tutego.de/javabuch/aufgaben/java.util.stream-api.html Aufgabe
 * Streams-1.1.2
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseStreams112 {

	public static void main(String[] args) {

		String[] names = { "Anne", "Captain CiaoCiao", "Balico", "Charles", "Anne", "CiaoCiao", "CiaoCiao", "Drake",
				"Anne", "Balico", "CiaoCiao" };

		Map<String, Long> votes = Arrays.stream(names).map(t -> t.equals("Captain CiaoCiao") ? "CiaoCiao" : t)
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

		System.out.println(votes);

	}

}
