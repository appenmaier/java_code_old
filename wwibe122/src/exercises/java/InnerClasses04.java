package exercises.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import exercises.java.coordinate.Coordinate;

public class InnerClasses04 {

  public static void main(String[] args) {

    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(4, 2));
    coordinates.add(new Coordinate(2, 4));
    coordinates.add(new Coordinate(9, 1));
    coordinates.add(new Coordinate(0, 1));

    Collections.sort(coordinates, new Comparator<Coordinate>() {
      @Override
      public int compare(Coordinate o1, Coordinate o2) {
        return Integer.valueOf(o1.getY()).compareTo(o2.getY());
      }
    });

    for (Coordinate c : coordinates) {
      System.out.println(c);
    }

  }

}
