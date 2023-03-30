package demos;

import demos.tableLamp.LightBulb02;
import demos.tableLamp.TableLamp02;

/**
 * Datenkapselung
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO03 {

  public static void main(String[] args) {

    LightBulb02 redLightBulb = new LightBulb02();
    redLightBulb.setColor("rot");
    // redLightBulb.color = "rot";

    LightBulb02 blueLightBulb = new LightBulb02();
    blueLightBulb.setColor("blau");
    // blueLightBulb.color = "blau";

    TableLamp02 tableLamp1 = new TableLamp02();

    // tableLamp1.isConnected = false;
    // tableLamp1.isShining = true;

    tableLamp1.plugIn();
    tableLamp1.switchOn();
    tableLamp1.changeLightBulb(redLightBulb);

    System.out.println(tableLamp1.toString());

  }

}
