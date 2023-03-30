package exams.exam2022q4.task05;

public class Circle extends Shape {

  private final double r;

  public Circle(double r) {
    super();
    this.r = r;
  }

  public double r() {
    return r;
  }

  public String toString() {
    String tmp = "Circle [r=" + r() + "]";
    return tmp;
  }

  public double getArea() {
    double area = Math.PI * r * r;
    return area;
  }

  public double getCircumference() {
    double circumference = 2 * Math.PI * r;
    return circumference;
  }

}
