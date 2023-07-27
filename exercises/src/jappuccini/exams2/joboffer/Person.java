package jappuccini.exams2.joboffer;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Person {

  private final String name;
  private final long birthDateTimeStamp;

  public Person(String name, long birthDateTimeStamp) {
    this.name = name;
    this.birthDateTimeStamp = birthDateTimeStamp;
  }

  public long birthDateTimeStamp() {
    return birthDateTimeStamp;
  }

  public String name() {
    return name;
  }

}
