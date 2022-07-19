package exercises.java.coordinate.v1;

import java.util.Comparator;

public class CoordinateComparator implements Comparator<Coordinate> {

	@Override
	public int compare(Coordinate c1, Coordinate c2) {
		return Double.valueOf(c1.getDistanceToOriginPoint()).compareTo(c2.getDistanceToOriginPoint());
	}

}
