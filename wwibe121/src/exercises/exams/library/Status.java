package exercises.exams.library;

public enum Status {

  AVAILABLE("verfuegbar"), LENT("verliehen");

  private String description;

  Status(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
