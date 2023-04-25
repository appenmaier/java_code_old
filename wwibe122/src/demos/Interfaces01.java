package demos;

import java.util.ArrayList;
import demos.tableLamp.LightBulb;
import demos.tableLamp.PlugType;
import demos.tableLamp.TableLamp;
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
    wiredDevices.add(new TableLamp(PlugType.TYPE_F)); // Upcast

    for (WiredDevice wiredDevice : wiredDevices) {
      /* Outdated */
      // wiredDevice.plugIn(); // (Dynamische) Polymorphie
      if (wiredDevice instanceof TableLamp) {
        TableLamp t = (TableLamp) wiredDevice; // Downcast
        t.changeLightBulb(new LightBulb());
        t.switchOn();
      }
      System.out.println(wiredDevice); // (Dynamische) Polymorphie
    }

  }

}
