package demos.tableLamp;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public final class FlashLight02 extends Light02 {

  /* Attribute */
  private double energyLevel;

  /* Methoden */
  public FlashLight02() {
    energyLevel = 1.0;
  }

  public double getEnergyLevel() {
    return energyLevel;
  }

  public void recharge() {
    energyLevel = 1.0;
  }

  @Override
  public void switchOn() {
    isOn = true;
    energyLevel -= 0.1;
    if (energyLevel > 0) {
      isShining = true;
    }
  }

  @Override
  public String toString() {
    return "FlashLight [energyLevel=" + energyLevel + ", isOn=" + isOn + ", isShining=" + isShining
        + "]";
  }

}
