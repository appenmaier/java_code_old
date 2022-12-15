package exercises.tutego.radio;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 6.0
 * 
 */
public class Radio06 {

  private boolean isOn;
  private int volume;
  private double frequency;

  public Radio06() {}

  public Radio06(double frequency) {
    this.frequency = frequency;
  }

  public Radio06(String sender) {
    frequency = Radio06.senderToFrequency(sender);
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
