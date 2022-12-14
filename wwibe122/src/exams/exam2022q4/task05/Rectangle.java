package exams.exam2022q4.task05;

public class Rectangle extends Shape {

  private final double a;
  private final double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getArea() {
    return a * b;
  }

  public double getCircumference() {
    return 2 * a + 2 * b;
  }

}
