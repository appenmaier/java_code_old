package exercises.tutego;

import java.util.Random;

/**
 * https://tutego.de/javabuch/aufgaben/array.html Aufgabe Array-1.1.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseArray111 {

	public static void main(String[] args) {

		int size = 30;
		Random rnd = new Random();

		int[] windSpeed = new int[size];
		int[] windDirection = new int[size];

		for (int i = 0; i < size; i++) {
			windSpeed[i] = rnd.nextInt(200);
			windDirection[i] = rnd.nextInt(360);
		}

		for (int i = 0; i < size; i++) {
			System.out.println("Wind speed " + windSpeed[i] + " km/h and wind direction " + windDirection[i] + "°");
		}

	}

}
