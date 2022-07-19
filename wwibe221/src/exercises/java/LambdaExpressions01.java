package exercises.java;

import java.util.ArrayList;
import java.util.Collections;

import exercises.java.coordinate.v1.Coordinate;

/**
 * Uebungsaufgabe LambdaExpressions01
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LambdaExpressions01 {

	public static void main(String[] args) {

		ArrayList<Coordinate> coordinates = new ArrayList<>();

		coordinates.add(new Coordinate(3, 5));
		coordinates.add(new Coordinate(7, 6));
		coordinates.add(new Coordinate(2, 1));
		coordinates.add(new Coordinate(6, 8));
		coordinates.add(new Coordinate(1, 9));

		Collections.sort(coordinates, (c1, c2) -> Integer.valueOf(c2.x()).compareTo(c1.x()));

		for (Coordinate c : coordinates) {
			System.out.println(c + ": " + c.getDistanceToOriginPoint());
		}

	}

}
