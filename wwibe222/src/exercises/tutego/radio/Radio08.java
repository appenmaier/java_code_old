package exercises.tutego.radio;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 8.0
 * 
 */
public class Radio08 {

  private boolean isOn;
  private int volume;
  private double frequency;
  private Modulation modulation;

  public Radio08() {}

  public Radio08(double frequency) {
    this.frequency = frequency;
  }

  public Radio08(String sender) {
    frequency = Radio08.senderToFrequency(sender);
  }

  public Radio08(Radio08 r) {
    isOn = r.isOn();
    volume = r.getVolume();
    frequency = r.getFrequency();
    modulation = r.getModulation();
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
        + (modulation == null ? "" : ", Modulation=" + modulation.toString())
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

  public void setModulation(Modulation modulation) {
    this.modulation = modulation;
  }

  public Modulation getModulation() {
    return modulation;
  }

}
