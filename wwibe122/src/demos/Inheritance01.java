package demos;

import java.awt.Color;
import java.util.ArrayList;
import demos.tableLamp.LightBulb_v4;
import demos.tableLamp.PlugType_v2;
import demos.tableLamp.TableLamp_v5;

/**
 * Vererbung und Polymorphie
 * 
 * @author Daniel Appenmaier
 *
 */

public class Inheritance01 {

  public static void main(String[] args) {

    /* Objekterzeugungen */
    LightBulb_v4 redLightBulb = new LightBulb_v4(Color.RED);
    TableLamp_v5 tableLamp1 = new TableLamp_v5(PlugType_v2.TYPE_F);
    tableLamp1.changeLightBulb(redLightBulb);

    LightBulb_v4 whiteLightBulb = new LightBulb_v4();
    TableLamp_v5 tableLamp2 = new TableLamp_v5(PlugType_v2.TYPE_B);
    tableLamp2.changeLightBulb(whiteLightBulb);

    FlashLight flashLight1 = new FlashLight();
    FlashLight flashLight2 = new FlashLight();

    /* Ansatz ohne Vererbung */
    ArrayList<TableLamp_v5> tableLamps = new ArrayList<>();
    tableLamps.add(tableLamp1);
    tableLamps.add(tableLamp2);

    for (int i = 0; i < tableLamps.size(); i++) {
      TableLamp_v5 tableLamp = tableLamps.get(i);
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
      if (light instanceof TableLamp_v5) {
        TableLamp_v5 tableLamp = (TableLamp_v5) light; // Downcast
        tableLamp.plugIn();
      }
      // seit Java 16
      if (light instanceof TableLamp_v5 tableLamp) { // Downcast
        tableLamp.plugIn();
      }
      System.out.println(light); // Polymorphie
      light.switchOff(); // Polymorphie
    }

  }

}
