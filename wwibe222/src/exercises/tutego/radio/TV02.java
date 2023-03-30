package exercises.tutego.radio;

/**
 * Fernseher
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 * 
 */
public class TV02 extends ElectronicDevice {

  private MonitorTube monitorTube;

  public TV02() {
    monitorTube = new MonitorTube();
  }

  public void on() {
    super.on();
    // System.out.println("Fernseher an");
    monitorTube.on();
  }

  public void off() {
    super.off();
    // System.out.println("Fernseher aus");
    monitorTube.off();
  }

  public String toString() {
    return "Fernseher [" + (isOn() ? "ist an]" : "ist aus]");
  }

}
