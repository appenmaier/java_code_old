package demos.electronicdevice;

public class TableLamp extends AbstractWiredElectronicDevice implements LightSource {

  private String lightBulb;

  public TableLamp(String lightBulb) {
    this.lightBulb = lightBulb;
  }

  @Override
  public boolean isWorking() {
    return isPlugged && isOn && lightBulb != null;
  }

}
