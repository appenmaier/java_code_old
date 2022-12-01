package demos.person.v1;

import java.util.Objects;

/**
 * Person
 * 
 * @author Daniel Appenmaier
 *
 */
public class Person {

  /* Attribute */
  private String name;
  private int age;
  private char gender;

  /* Methoden */
  public Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, gender, name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Person other = (Person) obj;
    return age == other.age && gender == other.gender && Objects.equals(name, other.name);
  }

}
