package exercises.tutego.radio;

/**
 * Fernseher
 * 
 * @author Daniel Appenmaier
 * 
 */
public class TV extends ElectronicDevice {

  private MonitorTube monitorTube;

  public TV() {
    monitorTube = new MonitorTube();
  }

  @Override
  public void off() {
    super.off();
    monitorTube.off();
  }

  @Override
  public void on() {
    super.on();
    monitorTube.on();
  }

  @Override
  public String toString() {
    return "Fernseher [Leistung=" + getWatt() + " W" + (isOn() ? ", ist an]" : ", ist aus]");
  }

}
