package exercises.tutego;

import helpers.Calculator;

/**
 * https://tutego.de/javabuch/aufgaben/imperativ.html Aufgabe Imperativ-1.6.3
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseImperativ163 {

  public static void main(String[] args) {

    System.out.println(Calculator.isRightTriangle(3, 4, 5, 0.1));
    System.out.println(Calculator.isRightTriangle(5, 3, 4, 0.1));
    System.out.println(Calculator.isRightTriangle(5, 12, 13, 0.1));
    System.out.println(Calculator.isRightTriangle(1, 2, 3, 0.1));
    System.out.println(Calculator.isRightTriangle(1, 1, Math.sqrt(2), 0.1));

  }

}
