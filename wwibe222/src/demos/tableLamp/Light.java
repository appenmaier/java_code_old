package demos.tableLamp;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 *
 */
public class Light {

  protected boolean isOn;
  protected boolean isShining;

  public boolean isOn() {
    return isOn;
  }

  public boolean isShining() {
    return isShining;
  }

  public void switchOff() {
    isOn = false;
    isShining = false;
  }

  public void switchOn() {
    isOn = true;
    isShining = true;
  }

}
