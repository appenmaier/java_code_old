package demos.tablelamp.v9;

import java.util.ArrayList;
import java.util.Optional;

public record TableLampStore(String name, ArrayList<TableLamp> tableLamps) {

	public void switchOnAll() {
		tableLamps.stream().forEach(TableLamp::switchOn);
	}

	public TableLamp getBrightestTableLamp() {
		Optional<TableLamp> x = tableLamps.stream().sorted().findFirst();
		if (x.isPresent()) {
			return x.get();
		}
		return null;
	}

}
