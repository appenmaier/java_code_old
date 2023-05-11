package exercises.java;

import java.util.ArrayList;
import java.util.Collections;
import exercises.java.coordinate.Coordinate;
import exercises.java.coordinate.CoordinateComparator;

public class Comparators02 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(4, 2));
    coordinates.add(new Coordinate(2, 4));
    coordinates.add(new Coordinate(9, 1));
    coordinates.add(new Coordinate(0, 1));

    Collections.sort(coordinates, new CoordinateComparator());

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }

  }

}
