package demos.electronicdevice;

public abstract class AbstractWiredElectronicDevice implements WiredDevice, ElectronicDevice {

  protected boolean isPlugged;
  protected boolean isOn;

  @Override
  public abstract boolean isWorking();

  @Override
  public final void plugIn() {
    isPlugged = true;
  }

  @Override
  public final void pullThePlug() {
    isPlugged = false;
  }

  @Override
  public final void switchOff() {
    isOn = false;
  }

  @Override
  public final void switchOn() {
    isOn = true;
  }

}
