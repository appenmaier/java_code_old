package exams.videocollection;

/**
 * Blu-Ray
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BluRay extends Video {

  private final double capacity;

  public BluRay(Movie movie, double capacity) {
    super(movie);
    this.capacity = capacity;
  }

  public double capacity() {
    return capacity;
  }

}
