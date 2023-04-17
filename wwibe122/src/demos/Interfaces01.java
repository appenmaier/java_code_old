package demos;

import java.util.ArrayList;
import demos.tableLamp.LightBulb04;
import demos.tableLamp.PlugType02;
import demos.tableLamp.TableLamp07;
import demos.tableLamp.Toaster;
import demos.tableLamp.WiredDevice;

/**
 * Schnittstellen (Interfaces)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Interfaces01 {

  public static void main(String[] args) {

    ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

    // wiredDevices.add(new WiredDevice());
    wiredDevices.add(new Toaster()); // Upcast
    wiredDevices.add(new TableLamp07(PlugType02.TYPE_F)); // Upcast

    for (WiredDevice wiredDevice : wiredDevices) {
      wiredDevice.plugIn(); // (Dynamische) Polymorphie
      if (wiredDevice instanceof TableLamp07) {
        TableLamp07 t = (TableLamp07) wiredDevice; // Downcast
        t.changeLightBulb(new LightBulb04());
        t.switchOn();
      }
      System.out.println(wiredDevice); // (Dynamische) Polymorphie
    }

  }

}
