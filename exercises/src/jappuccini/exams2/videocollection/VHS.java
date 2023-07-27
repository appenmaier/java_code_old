package jappuccini.exams2.videocollection;

/**
 * VHS
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class VHS extends Video {

  private final boolean isRewritable;

  public VHS(Movie movie, boolean isRewritable) {
    super(movie);
    this.isRewritable = isRewritable;
  }

  public boolean isRewritable() {
    return isRewritable;
  }

}
