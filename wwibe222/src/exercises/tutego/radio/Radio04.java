package exercises.tutego.radio;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 4.0
 * 
 */
public class Radio04 {

  private boolean isOn;
  private int volume;
  private double frequency;

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
    return "Radio [Lautstaerke=" + volume + ", Frequenz=" + frequency + " MHz"
        + (isOn ? ", ist an]" : ", ist aus]");
  }

  public void setFrequency(double f) {
    frequency = f;
  }

  public double getFrequency() {
    return frequency;
  }

  public int getVolume() {
    return volume;
  }

}
