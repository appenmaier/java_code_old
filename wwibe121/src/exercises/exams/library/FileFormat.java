package exercises.exams.library;

public enum FileFormat {

  AZW("Amazon Kindle"), EPUB("Electronic Publication"), LRF("Portable Reader File");

  private final String description;

  FileFormat(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
