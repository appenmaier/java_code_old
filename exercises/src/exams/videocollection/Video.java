package exams.videocollection;

/**
 * Video
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Video {

  private final Movie movie;

  public Video(Movie movie) {
    this.movie = movie;
  }

  public Movie movie() {
    return movie;
  }

}
