package demos.electronicdevice;

public class FlashLight implements ElectronicDevice, LightSource {

	private boolean isOn;

	@Override
	public void switchOn() {
		isOn = true;
	}

	@Override
	public void switchOff() {
		isOn = false;
	}

	@Override
	public boolean isWorking() {
		return isOn;
	}

}
