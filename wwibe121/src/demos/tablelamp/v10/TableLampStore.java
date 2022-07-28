package demos.tablelamp.v10;

import java.util.ArrayList;

/**
 * Tischleuchten-Laden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record TableLampStore(String name, ArrayList<TableLamp> tableLamps) {

	/*
	 * Methoden
	 */
	public void plugInAndSwitchOnAllTableLamps() throws AlreadyPluggedInException {
		for (TableLamp t : tableLamps) {
			t.plugIn();
			t.switchOn();
		}
	}

}
