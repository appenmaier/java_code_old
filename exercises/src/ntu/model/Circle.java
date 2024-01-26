package ntu.model;

/**
 * Kreis
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class Circle {
  private String color;
  private double radius;

  /** Constructs a Circle instance with default value for radius and color */
  public Circle() {
    radius = 1.0;
    color = "red";
  }

  /** Constructs a Circle instance with the given radius and default color */
  public Circle(double radius) {
    this.radius = radius;
    color = "red";
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  /** Returns the area of this Circle instance */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }
  /* version 1.0: - */

  public String getColor() {
    return color;
  }

  /** Returns the radius */
  public double getRadius() {
    return radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
  @Override
  public String toString() {
    return "Circle [radius=" + radius + " color=" + color + "]";
  }

}
