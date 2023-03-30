package demos.tableLamp;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Light {

  /* Attribute */
  protected boolean isOn;
  protected boolean isShining;

  /* Methoden */
  public boolean isOn() {
    return isOn;
  }

  public boolean isShining() {
    return isShining;
  }

  public void switchOn() {
    isOn = true;
    isShining = true;
  }

  public void switchOff() {
    isOn = false;
    isShining = false;
  }

}
