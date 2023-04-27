package demos.student;

import java.util.Objects;

public class Student {

  private final String id;

  public Student(String id) {
    this.id = id;
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
    Student other = (Student) obj;
    return Objects.equals(id, other.id);
  }

  public String getId() {
    return id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Student [id=" + id + "]";
  }

}
