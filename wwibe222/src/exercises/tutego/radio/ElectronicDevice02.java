package exercises.tutego.radio;

/**
 * Elektronisches Geraet
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class ElectronicDevice02 {

  private boolean isOn;
  private int watt;

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
    return "Elektronisches Geraet [Watt=" + watt + " kW" + (isOn ? ", ist an]" : ", ist aus]");
  }

  public static int numberOfElectronicDevicesSwitchedOn(ElectronicDevice02... electronicDevices) {
    int count = 0;

    for (ElectronicDevice02 e : electronicDevices) {
      if (e.isOn()) {
        count++;
      }
    }

    return count;
  }

  public void setWatt(int watt) throws IllegalWattException {
    if (watt <= 0) {
      throw new IllegalWattException("Ungueltige Wattzahl " + watt);
    }

    this.watt = watt;
  }

  public int getWatt() {
    return watt;
  }

}
