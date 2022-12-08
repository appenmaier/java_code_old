package demos.tableLamp.v5;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Vererbung und Polymorphie
 * 
 * @author Daniel Appenmaier
 *
 */

public class Inheritance01 {

  public static void main(String[] args) {

    /* Objekterzeugungen */
    LightBulb redLightBulb = new LightBulb(Color.RED);
    TableLamp tableLamp1 = new TableLamp(PlugTypeEnum.TYPE_F);
    tableLamp1.changeLightBulb(redLightBulb);

    LightBulb whiteLightBulb = new LightBulb();
    TableLamp tableLamp2 = new TableLamp(PlugTypeEnum.TYPE_B);
    tableLamp2.changeLightBulb(whiteLightBulb);

    FlashLight flashLight1 = new FlashLight();
    FlashLight flashLight2 = new FlashLight();

    /* Ansatz ohne Vererbung */
    ArrayList<TableLamp> tableLamps = new ArrayList<>();
    tableLamps.add(tableLamp1);
    tableLamps.add(tableLamp2);

    for (int i = 0; i < tableLamps.size(); i++) {
      TableLamp tableLamp = tableLamps.get(i);
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
      System.out.println(light);// Polymorphie
      if (light instanceof TableLamp tableLamp) {
        // TableLamp tableLamp = (TableLamp) light; // Downcast
        tableLamp.plugIn();
      }
      System.out.println(light);
      light.switchOff(); // Polymorphie
    }

  }

}
