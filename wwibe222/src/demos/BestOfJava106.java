package demos;

import java.util.ArrayList;
import demos.electronicdevice.AbstractWiredElectronicDevice;
import demos.electronicdevice.ElectronicDevice;
import demos.electronicdevice.FlashLight;
import demos.electronicdevice.TableLamp;
import demos.electronicdevice.Toaster;

/**
 * Wdh: Vererbung, Polymorphie, Schnittstellen
 * 
 * @author Daniel Appenmaier
 *
 */
public class BestOfJava106 {

  public static void main(String[] args) {

    Toaster toaster = new Toaster();
    FlashLight flashLight = new FlashLight();
    TableLamp tableLamp = new TableLamp("rote Gluehbirne");

    ArrayList<ElectronicDevice> devices = new ArrayList<>();

    devices.add(toaster); // Upcast
    devices.add(tableLamp); // Upcast
    devices.add(flashLight); // Upcast

    for (ElectronicDevice e : devices) {
      e.switchOn(); // (Dynamische) Polymorphie
      if (e instanceof AbstractWiredElectronicDevice a) {
        // AbstractWiredElectronicDevice a = (AbstractWiredElectronicDevice) e; // Downcast
        a.plugIn();
      }
      System.out.println(e + ": " + e.isWorking()); // (Dynamische) Polymorphie
    }

  }

}
