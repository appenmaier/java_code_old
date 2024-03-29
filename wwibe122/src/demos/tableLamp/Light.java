package demos.tableLamp;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public abstract class Light {

  protected boolean isOn;
  protected boolean isShining;

  public final boolean isOn() {
    return isOn;
  }

  public final boolean isShining() {
    return isShining;
  }

  public final void switchOff() {
    isOn = false;
    isShining = false;
  }

  public abstract void switchOn();

}
