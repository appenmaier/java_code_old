package exercises.tutego.radio;

import java.util.function.Predicate;

public class MaximumPowerConsumptionOfElectronicDevicePredicate
    implements Predicate<ElectronicDevice> {

  public int maximumPowerConsumption;

  public MaximumPowerConsumptionOfElectronicDevicePredicate(int maximumPowerConsumption) {
    this.maximumPowerConsumption = maximumPowerConsumption;
  }

  @Override
  public boolean test(ElectronicDevice e) {
    if (e.getWatt() > maximumPowerConsumption) {
      return true;
    } else {
      return false;
    }
  }

}
