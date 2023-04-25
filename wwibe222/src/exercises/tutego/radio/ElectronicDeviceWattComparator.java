package exercises.tutego.radio;

import java.util.Comparator;

public class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {

  @Override
  public int compare(ElectronicDevice electronicDevice1, ElectronicDevice electronicDevice2) {
    System.out
        .println("[compare] " + electronicDevice1.toString() + ", " + electronicDevice2.toString());
    Integer watt1 = electronicDevice1.getWatt();
    Integer watt2 = electronicDevice2.getWatt();
    return watt1.compareTo(watt2);
  }

}
