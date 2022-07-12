package demos.tablelamp.v9;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
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
