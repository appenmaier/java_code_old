package exercises.tutego.radio;

/**
 * Radio
 * 
 * @author Daniel Appenmaier
 * @version 10.0
 * 
 */
public class Radio10 extends ElectronicDevice {

  // private boolean isOn;
  private int volume;
  private double frequency;
  private Modulation modulation;
  @SuppressWarnings("unused")
  private double minFrequency;
  @SuppressWarnings("unused")
  private double maxFrequency;

  public Radio10() {}

  public Radio10(double frequency) {
    this.frequency = frequency;
  }

  public Radio10(String sender) {
    frequency = Radio10.senderToFrequency(sender);
  }

  public Radio10(Radio10 r) {
    if (r.isOn()) {
      on();
    }
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

  // public void on() {
  // isOn = true;
  // System.out.println("an");
  // }

  // public void off() {
  // isOn = false;
  // System.out.println("aus");
  // }

  // public boolean isOn() {
  // return isOn;
  // }

  public String toString() {
    return "Radio [Lautstaerke=" + volume + ", Frequenz=" + frequency + " MHz"
        + (modulation == null ? "" : ", Modulation=" + modulation.toString())
        + (isOn() ? ", ist an]" : ", ist aus]");
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
    if (modulation.equals(Modulation.AM)) {
      minFrequency = 0.1485;
      maxFrequency = 26.1;
    } else {
      minFrequency = 87.5;
      maxFrequency = 108;
    }
  }

  public Modulation getModulation() {
    return modulation;
  }

}
