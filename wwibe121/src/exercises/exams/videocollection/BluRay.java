package exercises.exams.videocollection;

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
