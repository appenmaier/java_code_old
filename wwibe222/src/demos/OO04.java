package demos;

import demos.tableLamp.LightBulb;
import demos.tableLamp.TableLamp;

/**
 * Referenzvariablen und Objekte
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO04 {

  @SuppressWarnings({"null", "unused"})
  public static void main(String[] args) {

    int i = 0;
    TableLamp tableLamp1 = null;

    i = 5;
    LightBulb redLightBulb = new LightBulb();
    /* Outdated */
    // redLightBulb.setColor("rot");
    // tableLamp1 = new TableLamp();
    // tableLamp1.changeLightBulb(redLightBulb);

    int x = i;
    TableLamp tableLamp2 = tableLamp1;

    i = 7;
    tableLamp1.plugIn();
    tableLamp1.switchOn();

    System.out.println("i: " + i);
    System.out.println("tableLamp1: " + tableLamp1);
    System.out.println("x: " + x);
    System.out.println("tableLamp2: " + tableLamp2);

  }

}
