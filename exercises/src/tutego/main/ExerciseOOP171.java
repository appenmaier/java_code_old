package tutego.main;

import tutego.model.Firebox;
import tutego.model.IceMachine;
import tutego.model.Radio;
import tutego.model.Ship;
import tutego.model.TV;

/**
 * https://tutego.de/javabuch/aufgaben/oop_classes.html Aufgabe OOP-1.7.1
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ExerciseOOP171 {

  public static void main(String[] args) {

    Ship ship = new Ship();
    Radio radio1 = new Radio();
    Radio radio2 = new Radio();
    IceMachine iceMachine = new IceMachine();
    TV tv = new TV();
    Firebox firebox1 = new Firebox();
    Firebox firebox2 = new Firebox();

    radio1.on();
    iceMachine.on();
    tv.on();

    ship.addAllElectronicDevices(radio1, radio2, iceMachine, tv, firebox1, firebox2);
    System.out.println(ship.toString());

    ship.holiday();
    System.out.println(ship.toString());

  }

}
