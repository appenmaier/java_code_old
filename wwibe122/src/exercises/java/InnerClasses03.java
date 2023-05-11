package exercises.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import exercises.java.coordinate.Coordinate;

public class InnerClasses03 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(4, 2));
    coordinates.add(new Coordinate(2, 4));
    coordinates.add(new Coordinate(9, 1));
    coordinates.add(new Coordinate(0, 1));

    class CoordinateComparator implements Comparator<Coordinate> {
      @Override
      public int compare(Coordinate o1, Coordinate o2) {
        return Integer.valueOf(o1.getX()).compareTo(o2.getX());
      }
    }

    Collections.sort(coordinates, new CoordinateComparator());

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }

  }

}
