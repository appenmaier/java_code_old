package exercises.tutego.radio;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 7.0
 * 
 */
public class Radio_v7 {

  private boolean isOn;
  private int volume;
  private double frequency;

  public Radio_v7() {}

  public Radio_v7(double frequency) {
    this.frequency = frequency;
  }

  public Radio_v7(String sender) {
    frequency = Radio_v7.senderToFrequency(sender);
  }

  public Radio_v7(Radio_v7 r) {
    isOn = r.isOn();
    volume = r.getVolume();
    frequency = r.getFrequency();
  }

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

  public void setFrequency(double frequency) {
    this.frequency = frequency;
  }

  public double getFrequency() {
    return frequency;
  }

  public int getVolume() {
    return volume;
  }

  public static double senderToFrequency(String sender) {
    switch (sender) {
      case "DASDING":
        return 107.2;
      default:
        return 0;
    }
  }

}
