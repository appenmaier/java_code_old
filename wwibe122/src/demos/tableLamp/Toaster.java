package demos.tableLamp;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 *
 */
public class Toaster implements WiredDevice {

  @Override
  public void plugIn() {
    System.out.println("Ich, der Toaster, bin eingesteckt");
  }

  @Override
  public void pullThePlug() {
    System.out.println("Ich, der Toaster, bin ausgesteckt");
  }

}
