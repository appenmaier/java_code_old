package exercises.java.coordinate;

import java.util.Comparator;

public class CoordinateComparator implements Comparator<Coordinate> {

  @Override
  public int compare(Coordinate o1, Coordinate o2) {
    return Double.valueOf(o2.getDistanceToOriginPoint()).compareTo(o1.getDistanceToOriginPoint());
  }

}
