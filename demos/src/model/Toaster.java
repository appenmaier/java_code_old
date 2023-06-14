package model;

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
    System.out.println("Ich, der Toaster, bin eingesteckt");
  }

  @Override
  public void pullThePlug() {
    System.out.println("Ich, der Toaster, bin ausgesteckt");
  }

}
