package demos;

import java.awt.Color;
import java.util.ArrayList;
import demos.tableLamp.LightBulb04;
import demos.tableLamp.PlugType02;
import demos.tableLamp.TableLamp05;

/**
 * Vererbung und Polymorphie
 * 
 * @author Daniel Appenmaier
 *
 */

public class Inheritance01 {

  public static void main(String[] args) {

    /* Objekterzeugungen */
    LightBulb04 redLightBulb = new LightBulb04(Color.RED);
    TableLamp05 tableLamp1 = new TableLamp05(PlugType02.TYPE_F);
    tableLamp1.changeLightBulb(redLightBulb);

    LightBulb04 whiteLightBulb = new LightBulb04();
    TableLamp05 tableLamp2 = new TableLamp05(PlugType02.TYPE_B);
    tableLamp2.changeLightBulb(whiteLightBulb);

    FlashLight flashLight1 = new FlashLight();
    FlashLight flashLight2 = new FlashLight();

    /* Ansatz ohne Vererbung */
    ArrayList<TableLamp05> tableLamps = new ArrayList<>();
    tableLamps.add(tableLamp1);
    tableLamps.add(tableLamp2);

    for (int i = 0; i < tableLamps.size(); i++) {
      TableLamp05 tableLamp = tableLamps.get(i);
      tableLamp.switchOn();
      System.out.println(tableLamp.toString());
    }

    ArrayList<FlashLight> flashLights = new ArrayList<>();
    flashLights.add(flashLight1);
    flashLights.add(flashLight2);

    for (int i = 0; i < flashLights.size(); i++) {
      FlashLight flashLight = flashLights.get(i);
      flashLight.switchOn();
      System.out.println(flashLight.isOn() + " - " + flashLight.getEnergyLevel());
    }

    /* Ansatz mit Vererbung */
    ArrayList<Light> lights = new ArrayList<>();
    lights.add(tableLamp1); // Upcast
    lights.add(tableLamp2); // Upcast
    lights.add(flashLight1); // Upcast
    lights.add(flashLight2); // Upcast

    for (int i = 0; i < lights.size(); i++) {
      Light light = lights.get(i);
      light.switchOn(); // Polymorphie
      // bis Java 16
      if (light instanceof TableLamp05) {
        TableLamp05 tableLamp = (TableLamp05) light; // Downcast
        tableLamp.plugIn();
      }
      // seit Java 16
      if (light instanceof TableLamp05 tableLamp) { // Downcast
        tableLamp.plugIn();
      }
      System.out.println(light); // Polymorphie
      light.switchOff(); // Polymorphie
    }

  }

}
