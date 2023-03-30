package demos;

import demos.tableLamp.LightBulb;
import demos.tableLamp.TableLamp;

/**
 * Klassen, Attribute und Methoden
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO02 {

  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb();
    redLightBulb.color = "rot";

    LightBulb blueLightBulb = new LightBulb();
    blueLightBulb.color = "blau";

    TableLamp tableLamp1 = new TableLamp();

    tableLamp1.plugIn();
    tableLamp1.switchOn();
    tableLamp1.changeLightBulb(redLightBulb);

    System.out.println(tableLamp1.toString());

  }

}
