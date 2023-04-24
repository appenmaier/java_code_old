package exercises.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import exercises.java.coordinate.Coordinate;
import exercises.java.coordinate.CoordinateComparator;

public class Comparators01 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(6, 2));
    coordinates.add(new Coordinate(1, 3));
    coordinates.add(new Coordinate(4, 3));
    coordinates.add(new Coordinate(3, 4));

    /* Comparable */
    Collections.sort(coordinates);
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();

    /* Aussere Klasse */
    Collections.sort(coordinates, new CoordinateComparator());
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();

    /* Lokale Klasse */
    class CoordinateByXAscendingComparator implements Comparator<Coordinate> {
      @Override
      public int compare(Coordinate o1, Coordinate o2) {
        return Integer.valueOf(o1.getX()).compareTo(o2.getX());
      }
    }
    Collections.sort(coordinates, new CoordinateByXAscendingComparator());
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();

    /* Anonyme Klasse */
    Collections.sort(coordinates, new Comparator<Coordinate>() {
      @Override
      public int compare(Coordinate o1, Coordinate o2) {
        return Integer.valueOf(o1.getY()).compareTo(o2.getY());
      }
    });
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }
    System.out.println();

    /* Lambda Ausdruck */
    Collections.sort(coordinates, (o1, o2) -> {
      return Integer.valueOf(o2.getX()).compareTo(o1.getX());
    });
    for (Coordinate c : coordinates) {
      System.out.println(c);
    }

    /* Methodenreferenz */
    Collections.sort(coordinates, (o1, o2) -> Integer.valueOf(o2.getY()).compareTo(o1.getY()));
    System.out.println();
    coordinates.forEach(coordinate -> System.out.println(coordinate));
    System.out.println();
    coordinates.forEach(System.out::println);

  }

}
