package demos.electronicdevice;

public class FlashLight implements ElectronicDevice, LightSource {

  private boolean isOn;

  @Override
  public boolean isWorking() {
    return isOn;
  }

  @Override
  public void switchOff() {
    isOn = false;
  }

  @Override
  public void switchOn() {
    isOn = true;
  }

}
