package demos;

import java.util.Random;

/**
 * Pseudozufallszahlen und Mathematische Berechnungen
 * 
 * @author Daniel Appenmaier
 *
 */
public class JavaAPI02 {

  public static void main(String[] args) {

    /* Mathematische Berechnungen mit Hilfe der Klasse Math */
    double result = Math.sqrt(64);
    System.out.println("result: " + result);

    /* Pseudozufallszahlen */
    int randomNumber;

    randomNumber = (int) (Math.random() * 100) + 1;
    System.out.println("randomNumber: " + randomNumber);

    Random rd = new Random();
    randomNumber = rd.nextInt(100) + 1;
    System.out.println("randomNumber: " + randomNumber);

  }

}
