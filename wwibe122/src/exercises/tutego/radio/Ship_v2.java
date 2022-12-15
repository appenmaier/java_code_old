package exercises.tutego.radio;

import java.util.ArrayList;

/**
 * Schiff
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class Ship_v2 {

  private ArrayList<ElectronicDevice> electronicDevices;

  public Ship_v2() {
    electronicDevices = new ArrayList<>();
  }

  public void addElectronicDevice(ElectronicDevice electronicDevice) {
    electronicDevices.add(electronicDevice);
  }

  public void addAllElectronicDevices(ElectronicDevice... electronicDevices) {
    for (ElectronicDevice e : electronicDevices) {
      addElectronicDevice(e);
    }
  }

  public int numberOfElectronicDevicesSwitchedOn() {
    int count = 0;

    for (ElectronicDevice e : electronicDevices) {
      if (e.isOn()) {
        count++;
      }
    }

    return count;
  }

  public String toString() {
    String text = "";
    for (ElectronicDevice e : electronicDevices) {
      text += e.toString() + "\n";
    }
    text += "Anzahl eingeschalteter Geraete: " + numberOfElectronicDevicesSwitchedOn() + "\n";
    return text;
  }

  public void holiday() {
    for (ElectronicDevice e : electronicDevices) {
      e.off();
    }
  }

  public void addAndCheckElectronicDevice(ElectronicDevice electronicDevice) {
    if (electronicDevice instanceof Radio_v10) {
      Radio_v10 radio = (Radio_v10) electronicDevice;
      if (radio.getVolume() == 0) {
        return;
      }
    }

    addElectronicDevice(electronicDevice);
    System.out.println("GEZ-Gebuehren nicht vergessen");
  }

  public void addAndCheckAllElectronicDevices(ElectronicDevice... electronicDevices) {
    for (ElectronicDevice e : electronicDevices) {
      addAndCheckElectronicDevice(e);
    }
  }

}
