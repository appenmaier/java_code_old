package demos;

import java.util.ArrayList;

import demos.tablelamp.v8.PlugType;
import demos.tablelamp.v8.TableLamp;
import demos.tablelamp.v8.Toaster;
import demos.tablelamp.v8.WiredDevice;

/**
 * Schnittstellen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Inheritance04 {

	public static void main(String[] args) {

		ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

		WiredDevice wiredDevice;
		TableLamp tableLamp = new TableLamp(PlugType.TYPE_F);
		Toaster toaster = new Toaster();

		wiredDevice = tableLamp; // Upcast
		wiredDevices.add(wiredDevice);
		wiredDevices.add(toaster); // Upcast

		for (WiredDevice w : wiredDevices) { // Polymorphie
			w.plugIn();
			if (w instanceof TableLamp t) { // Downcast
				t.switchOn();
			}
		}

		System.out.println(tableLamp);

	}

}
