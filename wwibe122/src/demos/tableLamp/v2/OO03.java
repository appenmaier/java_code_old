package demos.tableLamp.v2;

/**
 * Datenkapselung
 * 
 * @author Daniel Appenmaier
 *
 */
public class OO03 {

  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb();
    redLightBulb.setColor("rot");
    // redLightBulb.color = "rot";

    LightBulb blueLightBulb = new LightBulb();
    blueLightBulb.setColor("blau");
    // blueLightBulb.color = "blau";

    TableLamp tableLamp1 = new TableLamp();

    // tableLamp1.isConnected = false;
    // tableLamp1.isShining = true;

    tableLamp1.plugIn();
    tableLamp1.switchOn();
    tableLamp1.changeLightBulb(redLightBulb);

    System.out.println(tableLamp1.toString());

  }

}
