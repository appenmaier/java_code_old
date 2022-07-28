package demos.tablelamp.v10;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Tischleuchten-Laden
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record TableLampStore(String name, ArrayList<TableLamp> tableLamps) {

	public void plugInAndSwitchOnAllTableLamps() {
		tableLamps.stream().forEach(t -> {
			try {
				t.plugIn();
				t.switchOn();
			} catch (AlreadyPluggedInException e) {
				e.printStackTrace();
			}
		});
	}

	public TableLamp getBrightestTableLamp() {
		Optional<TableLamp> brightestTableLamp = tableLamps.stream().sorted().findFirst();
		if (brightestTableLamp.isPresent()) {
			return brightestTableLamp.get();
		}
		return null;
	}

}
