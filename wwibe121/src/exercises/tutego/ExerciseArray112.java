package exercises.tutego;

import java.util.Arrays;
import java.util.Random;

/**
 * https://tutego.de/javabuch/aufgaben/array.html Aufgabe Array-1.1.2
 * 
 * Hinweis: ohne Fehlerbehandlung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseArray112 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] dailyGains = new int[31];

		for (int i = 0; i < dailyGains.length; i++) {
			dailyGains[i] = rnd.nextInt(10000);
		}

		System.out.println(Arrays.toString(dailyGains));

		int count = count5PercentJumps(dailyGains);
		System.out.println("count: " + count);

	}

	public static int count5PercentJumps(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] >= array[i] * 0.05) {
				count++;
			}
		}
		return count;
	}

}