package exercises.tutego.radio;

/**
 * Fernseher
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class TV {

  private MonitorTube monitorTube;

  public TV() {
    monitorTube = new MonitorTube();
  }

  public void on() {
    System.out.println("Fernseher an");
    monitorTube.on();
  }

  public void off() {
    System.out.println("Fernseher aus");
    monitorTube.off();
  }

}
