package demos.tablelamp.v9;

import java.util.Comparator;

/**
 * TableLampByBrightnessComparator
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class TableLampByBrightnessComparator implements Comparator<TableLamp> {

	/*
	 * Methoden
	 */
	/**
	 * Vergleicht die beiden eingehenden Tischleuchten anhand der Helligkeit der
	 * Gluehbirnen
	 * 
	 * @param t1 Tischleuchte 1
	 * @param t2 Tischleuchte 2
	 * @return Vergleichswert (Vergleichswert groesser Null: Tischleuchte 2 ist
	 *         heller; Vergleichswert kleiner Null: Tischleuchte 1 ist heller;
	 *         Vergleichswert gleich Null: die Tischleuchten sind gleich hell)
	 */
	public int compare(TableLamp t1, TableLamp t2) {
		if (t1.getLightBulb() != null && t2.getLightBulb() != null) {
			return Double.compare(t2.getLightBulb().getBrightness(), t1.getLightBulb().getBrightness());
		} else if (t1.getLightBulb() != null) {
			return -1;
		} else if (t2.getLightBulb() != null) {
			return 1;
		} else {
			return 0;
		}
	}

}
