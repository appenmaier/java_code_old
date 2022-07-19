package exercises.java.coordinate.v1;

/**
 * Koordinate
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record Coordinate(int x, int y) implements Comparable<Coordinate> {

	/*
	 * Methoden
	 */
	public double getDistanceToOriginPoint() {
		return Math.hypot(x, y);
	}

	@Override
	public int compareTo(Coordinate c) {
		return Double.valueOf(c.getDistanceToOriginPoint()).compareTo(this.getDistanceToOriginPoint());
	}

}
