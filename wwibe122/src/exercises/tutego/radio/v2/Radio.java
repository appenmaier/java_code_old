package exercises.tutego.radio.v2;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Radio {

  public boolean isOn;
  public int volume;

  public void volumeUp() {
    volume++;
  }

  public void volumeDown() {
    volume--;
  }

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
    return "Radio [Lautstaerke=" + volume + (isOn ? ", ist an]" : ", ist aus]");
  }

}
