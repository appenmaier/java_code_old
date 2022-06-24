package exercises.tutego.radio.v11;
import java.util.Comparator;

/**
 * ElectronicDeviceWattComparator
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {

	public int compare(ElectronicDevice electronicDevice1, ElectronicDevice electronicDevice2) {
        System.out.println("[compare] " + electronicDevice1.toString() + ", "
         + electronicDevice2.toString());
        // if (electronicDevice1.getWatt() > electronicDevice2.getWatt()) {
            // return 1;
        // } else if (electronicDevice1.getWatt() < electronicDevice2.getWatt()) {
            // return -1;
        // } else {
            // return 0;
        // }
        Integer watt1 = electronicDevice1.getWatt();
        Integer watt2 = electronicDevice2.getWatt();
        return watt1.compareTo(watt2);
    }

}
