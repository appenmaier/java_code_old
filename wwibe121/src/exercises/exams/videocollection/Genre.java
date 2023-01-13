package exercises.exams.videocollection;

public enum Genre {

  SCIFI("Science-Fiction"), HORROR("Horror"), ACTION("Action"), COMEDY("Komoedie");

  private final String description;

  private Genre(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
