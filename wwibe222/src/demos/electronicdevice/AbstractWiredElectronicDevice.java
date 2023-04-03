package demos.electronicdevice;

public abstract class AbstractWiredElectronicDevice implements WiredDevice, ElectronicDevice {

	protected boolean isPlugged;
	protected boolean isOn;

	@Override
	public void plugIn() {
		isPlugged = true;
	}

	@Override
	public void pullThePlug() {
		isPlugged = false;
	}

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
		return isPlugged && isOn;
	}

}
