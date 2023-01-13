package exercises.exams.videocollection;

public abstract class Video {

  private final Movie movie;

  public Video(Movie movie) {
    this.movie = movie;
  }

  public Movie movie() {
    return movie;
  }

}
