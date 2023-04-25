package demos;

import java.util.InputMismatchException;
import java.util.Scanner;
import demos.tableLamp.AlreadyPluggedInException;
import demos.tableLamp.FlashLight;
import demos.tableLamp.Light;
import demos.tableLamp.PlugType;
import demos.tableLamp.TableLamp;

/**
 * Ausnahmen (Exceptions)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Exceptions01 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* ArrayIndexOutOfBoundsException und NullPointerException */
    String[] names = {"Hans", "Peter", null};
    try {
      System.out.println(names[3]);
      String name = names[2];
      System.out.println(name.toUpperCase());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    } catch (NullPointerException e) {
      e.printStackTrace();
    }

    /* InputMismatchException */
    try {
      Scanner sc = new Scanner(System.in);
      System.out.print("Bitte gib eine ganze Zahl ein: ");
      int number = sc.nextInt();
      System.out.println(number);
    } catch (InputMismatchException e) {
      System.out.println("Eine InputMismatchException ist aufgetreten");
    }

    /* ClassCastException */
    Light light;
    light = new TableLamp(PlugType.TYPE_F);
    if (light instanceof FlashLight) {
      FlashLight flashLight = (FlashLight) light;
      flashLight.recharge();
    }

    /* AlreadyPluggedInException */
    TableLamp tableLamp = new TableLamp(PlugType.TYPE_F);
    try {
      tableLamp.plugIn();
      tableLamp.plugIn();
      tableLamp.plugIn();
    } catch (AlreadyPluggedInException e) {
      // Fehlerbehandlung
      System.err.println(e.getMessage());
    }

    System.out.println("Programmende");

  }

}
