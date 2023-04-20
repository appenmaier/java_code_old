package exercises.java;

import java.util.ArrayList;
import java.util.Collections;
import exercises.java.coordinate.Coordinate;
import exercises.java.coordinate.CoordinateComparator;

public class Comparators01 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(6, 2));
    coordinates.add(new Coordinate(1, 3));
    coordinates.add(new Coordinate(4, 3));
    coordinates.add(new Coordinate(3, 4));

    Collections.sort(coordinates);

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();

    Collections.sort(coordinates, new CoordinateComparator());

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }

  }

}
