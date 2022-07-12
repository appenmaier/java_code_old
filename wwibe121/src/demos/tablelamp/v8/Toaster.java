package demos.tablelamp.v8;

public class Toaster implements WiredDevice {

	@Override
	public void plugIn() {
		System.out.println("Toaster ist eingesteckt");
	}

	@Override
	public void pullThePlug() {
		System.out.println("Toaster ist ausgesteckt");
	}

}
