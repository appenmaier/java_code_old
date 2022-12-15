package demos;

import demos.tableLamp.LightBulb_v2;
import demos.tableLamp.TableLamp_v2;

/**
 * Referenzvariablen und Objekte
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO04 {

  public static void main(String[] args) {

    int i = 0;
    TableLamp_v2 tableLamp1 = null;

    i = 5;
    LightBulb_v2 redLightBulb = new LightBulb_v2();
    redLightBulb.setColor("rot");
    tableLamp1 = new TableLamp_v2();
    tableLamp1.changeLightBulb(redLightBulb);

    int x = i;
    TableLamp_v2 tableLamp2 = tableLamp1;

    i = 7;
    tableLamp1.plugIn();
    tableLamp1.switchOn();

    System.out.println("i: " + i);
    System.out.println("tableLamp1: " + tableLamp1);
    System.out.println("x: " + x);
    System.out.println("tableLamp2: " + tableLamp2);

  }

}
