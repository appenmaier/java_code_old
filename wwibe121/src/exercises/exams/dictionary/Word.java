package exercises.exams.dictionary;

public record Word(String value, Language language) implements Comparable<Word> {

  @Override
  public int compareTo(Word other) {
    return this.value().compareTo(other.value());
  }

}
