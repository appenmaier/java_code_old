package ntu.main;

import ntu.model.Ball;

/**
 * Aufgabe OOP 1.9
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E010N_OOP19 {

  public static void main(String[] args) {

    Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
    System.out.println(ball);

    ball.setX(80.0f);
    ball.setY(35.0f);
    ball.setRadius(5);
    ball.setXDelta(4.0f);
    ball.setYDelta(6.0f);
    System.out.println(ball);
    System.out.println("x is: " + ball.getX());
    System.out.println("y is: " + ball.getY());
    System.out.println("radius is: " + ball.getRadius());
    System.out.println("xDelta is: " + ball.getXDelta());
    System.out.println("yDelta is: " + ball.getYDelta());

    float xMin = 0.0f;
    float xMax = 100.0f;
    float yMin = 0.0f;
    float yMax = 50.0f;
    for (int i = 0; i < 15; i++) {
      ball.move();
      System.out.println(ball);
      float xNew = ball.getX();
      float yNew = ball.getY();
      int radius = ball.getRadius();
      if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
        ball.reflectHorizontal();
      }
      if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
        ball.reflectVertical();
      }
    }

  }

}
