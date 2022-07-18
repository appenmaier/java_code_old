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
 */
public class Inheritance04 {

	public static void main(String[] args) {

		ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

		Toaster toaster = new Toaster();
		TableLamp tableLamp = new TableLamp(PlugType.TYPE_F);

		wiredDevices.add(toaster); // Upcast
		wiredDevices.add(tableLamp); // Upcast

		/*
		 * Polymorphie
		 */
		for (WiredDevice w : wiredDevices) {
			w.plugIn();
			System.out.println(w);
		}

	}

}
