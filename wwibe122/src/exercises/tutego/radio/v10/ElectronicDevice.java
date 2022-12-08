package exercises.tutego.radio.v10;

/**
 * Elektronisches Geraet
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class ElectronicDevice {

  private boolean isOn;

  public void on() {
    isOn = true;
    System.out.println("an");
  }

  public void off() {
    isOn = false;
    System.out.println("aus");
  }

  public boolean isOn() {
    return isOn;
  }

  public String toString() {
    return "Elektronisches Geraet [" + (isOn ? "ist an]" : "ist aus]");
  }

  public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice... electronicDevices) {
    int count = 0;

    for (ElectronicDevice e : electronicDevices) {
      if (e.isOn()) {
        count++;
      }
    }

    return count;
  }

}
