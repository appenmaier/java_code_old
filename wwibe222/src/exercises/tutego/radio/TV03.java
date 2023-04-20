package exercises.tutego.radio;

/**
 * Fernseher
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class TV03 extends ElectronicDevice02 {

  private MonitorTube monitorTube;

  public TV03() {
    monitorTube = new MonitorTube();
  }

  @Override
  public void off() {
    super.off();
    // System.out.println("Fernseher aus");
    monitorTube.off();
  }

  @Override
  public void on() {
    super.on();
    // System.out.println("Fernseher an");
    monitorTube.on();
  }

  @Override
  public String toString() {
    return "Fernseher [Leistung=" + getWatt() + " W" + (isOn() ? ", ist an]" : ", ist aus]");
  }

}
