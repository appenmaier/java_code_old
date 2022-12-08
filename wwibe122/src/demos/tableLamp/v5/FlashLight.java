package demos.tableLamp.v5;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FlashLight extends Light {

  /* Attribute */
  private double energyLevel;

  /* Methoden */
  public FlashLight() {
    energyLevel = 1.0;
  }

  public void switchOn() {
    isOn = true;
    energyLevel -= 0.1;
    if (energyLevel > 0) {
      isShining = true;
    }
  }

  public void recharge() {
    energyLevel = 1.0;
  }

  public double getEnergyLevel() {
    return energyLevel;
  }

  @Override
  public String toString() {
    return "FlashLight [energyLevel=" + energyLevel + ", isOn=" + isOn + ", isShining=" + isShining
        + "]";
  }

}
