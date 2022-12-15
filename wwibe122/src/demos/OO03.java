package demos;

import demos.tableLamp.LightBulb_v2;
import demos.tableLamp.TableLamp_v2;

/**
 * Datenkapselung
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO03 {

  public static void main(String[] args) {

    LightBulb_v2 redLightBulb = new LightBulb_v2();
    redLightBulb.setColor("rot");
    // redLightBulb.color = "rot";

    LightBulb_v2 blueLightBulb = new LightBulb_v2();
    blueLightBulb.setColor("blau");
    // blueLightBulb.color = "blau";

    TableLamp_v2 tableLamp1 = new TableLamp_v2();

    // tableLamp1.isConnected = false;
    // tableLamp1.isShining = true;

    tableLamp1.plugIn();
    tableLamp1.switchOn();
    tableLamp1.changeLightBulb(redLightBulb);

    System.out.println(tableLamp1.toString());

  }

}
