package exams.exam2022q4.task05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeReader {

  private final ArrayList<Shape> shapes;

  public ShapeReader(File file) throws FileNotFoundException {
    shapes = new ArrayList<>();
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] tokens = line.split(";");
      if (tokens[0].equals("Circle")) {
        double r = Double.valueOf(tokens[1]);
        Circle circle = new Circle(r);
        shapes.add(circle);
      } else if (tokens[0].equals("Rectangle")) {
        double a = Double.valueOf(tokens[1]);
        double b = Double.valueOf(tokens[2]);
        Rectangle rectangle = new Rectangle(a, b);
        shapes.add(rectangle);
      }
    }

    sc.close();
  }

  public ArrayList<Circle> getCircles() {
    ArrayList<Circle> circles = new ArrayList<>();

    for (int i = 0; i < shapes.size(); i++) {
      Shape shape = shapes.get(i);
      if (shape instanceof Circle circle) { // Downcast
        // Circle circle = (Circle) shape; // Downcast
        circles.add(circle);
      }
    }

    return circles;
  }

  public ArrayList<Shape> getShapesWithMinArea(double minArea) {
    ArrayList<Shape> shapesWithMinArea = new ArrayList<>();

    for (int i = 0; i < shapes.size(); i++) {
      Shape shape = shapes.get(i);
      if (shape.getArea() >= minArea) {
        shapesWithMinArea.add(shape);
      }
    }

    return shapesWithMinArea;
  }

  public void printShapes() {

    for (int i = 0; i < shapes.size(); i++) {
      Shape shape = shapes.get(i);
      System.out.println(shape);
    }

    for (Shape shape : shapes) {
      System.out.println(shape);
    }

    // shapes.forEach(s -> System.out.println());
    // shapes.forEach(System.out::println);

  }

}
