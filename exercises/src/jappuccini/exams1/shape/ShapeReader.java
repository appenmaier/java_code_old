package jappuccini.exams1.shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ShapeReader
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShapeReader {

  private final ArrayList<Shape> shapes = new ArrayList<>();

  public ShapeReader(File file) throws FileNotFoundException {
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] tokens = line.split(";");
      if (tokens[0].equals("Circle")) {
        double r = Double.valueOf(tokens[1]);
        shapes.add(new Circle(r));
      } else if (tokens[0].equals("Rectanlge")) {
        double a = Double.valueOf(tokens[1]);
        double b = Double.valueOf(tokens[2]);
        shapes.add(new Rectangle(a, b));
      } else {
        double a = Double.valueOf(tokens[1]);
        shapes.add(new Square(a));
      }
    }

    sc.close();
  }

  public ArrayList<Circle> getCircles() {
    ArrayList<Circle> circles = new ArrayList<>();
    for (int i = 0; i < shapes.size(); i++) {
      Shape shape = shapes.get(i);
      if (shape instanceof Circle circle) {
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

}
