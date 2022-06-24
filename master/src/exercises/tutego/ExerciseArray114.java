package exercises.tutego;

import java.util.Arrays;

import helpers.IntegerArray;

/**
 * https://tutego.de/javabuch/aufgaben/array.html Aufgabe Array-1.1.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseArray114 {

	public static void main(String[] args) {

		int[] array = { 7, 2, 1, 9, 4, 1 };

		System.out.println("array: " + array);
		System.out.println(Arrays.toString(array));

		IntegerArray.reverseArray(array);

		System.out.println("array: " + array);
		System.out.println(Arrays.toString(array));

	}

}
