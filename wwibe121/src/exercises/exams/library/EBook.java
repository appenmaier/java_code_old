package exercises.exams.library;

public final class EBook extends Book {

  private final FileFormat fileFormat;
  private final int fileSize;

  public EBook(Author author, String title, FileFormat fileFormat, int fileSize)
      throws WrongFileSizeExcpetion {
    super(author, title);
    if (fileSize <= 0) {
      throw new WrongFileSizeExcpetion();
    }
    this.fileFormat = fileFormat;
    this.fileSize = fileSize;
  }

  public FileFormat fileFormat() {
    return fileFormat;
  }

  public int fileSize() {
    return fileSize;
  }

}
