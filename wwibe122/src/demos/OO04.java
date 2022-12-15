package demos;

import demos.tableLamp.LightBulb02;
import demos.tableLamp.TableLamp02;

/**
 * Referenzvariablen und Objekte
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO04 {

  public static void main(String[] args) {

    int i = 0;
    TableLamp02 tableLamp1 = null;

    i = 5;
    LightBulb02 redLightBulb = new LightBulb02();
    redLightBulb.setColor("rot");
    tableLamp1 = new TableLamp02();
    tableLamp1.changeLightBulb(redLightBulb);

    int x = i;
    TableLamp02 tableLamp2 = tableLamp1;

    i = 7;
    tableLamp1.plugIn();
    tableLamp1.switchOn();

    System.out.println("i: " + i);
    System.out.println("tableLamp1: " + tableLamp1);
    System.out.println("x: " + x);
    System.out.println("tableLamp2: " + tableLamp2);

  }

}
