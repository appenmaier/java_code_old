package demos.tablelamp.v8;

import java.util.ArrayList;

/**
 * Schnittstellen
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Demo37 {

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
