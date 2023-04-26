package demos;

import demos.tableLamp.LightBulb;

/**
 * Datenkapselung
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO03 {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb();
    /* Outdated */
    // redLightBulb.setColor("rot");
    // redLightBulb.color = "rot";

    LightBulb blueLightBulb = new LightBulb();
    /* Outdated */
    // blueLightBulb.setColor("blau");
    // blueLightBulb.color = "blau";

    /* Outdated */
    // TableLamp tableLamp1 = new TableLamp();

    // tableLamp1.isConnected = false;
    // tableLamp1.isShining = true;

    /* Outdated */
    // tableLamp1.plugIn();
    // tableLamp1.switchOn();
    // tableLamp1.changeLightBulb(redLightBulb);

    /* Outdated */
    // System.out.println(tableLamp1.toString());

  }

}
