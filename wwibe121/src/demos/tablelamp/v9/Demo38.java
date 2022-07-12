package demos.tablelamp.v9;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Komparatoren
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo38 {

	public static void main(String[] args) {

		ArrayList<TableLamp> tableLamps = new ArrayList<>();

		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb(Color.RED)));
		tableLamps.add(new TableLamp(PlugType.TYPE_I, new LightBulb()));
		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb(Color.BLUE)));
		tableLamps.add(new TableLamp(PlugType.TYPE_B, new LightBulb(Color.BLACK)));
		tableLamps.add(new TableLamp(PlugType.TYPE_F, new LightBulb(Color.RED)));

		tableLamps.get(2).plugIn();
		tableLamps.get(2).switchOn();
		tableLamps.get(4).plugIn();
		tableLamps.get(4).switchOn();

		/* unsortierte Liste */
		for (TableLamp t : tableLamps) {
			System.out.println(t);
		}
		System.out.println();

		/* sortierte Liste (aufsteigend nach dem Steckertyp) */
		Collections.sort(tableLamps);

		for (TableLamp t : tableLamps) {
			System.out.println(t);
		}
		System.out.println();

		/* sortierte Liste (aufsteigend nach Leuchtet?) */
		Collections.sort(tableLamps, new TableLampByShiningComparator());

		for (TableLamp t : tableLamps) {
			System.out.println(t);
		}

	}

}
