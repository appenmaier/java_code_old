package demos.electronicdevice;

public final class Toaster extends AbstractWiredElectronicDevice {

  @Override
  public boolean isWorking() {
    return isPlugged && isOn;
  }

}
