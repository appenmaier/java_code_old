package exercises.tutego.toaster;

import java.util.Objects;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 * 
 * 
 */
public class Toaster {

  private int capacity;
  private boolean stainless;
  private boolean extraLarge;

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Toaster)) {
      return false;
    }
    Toaster toaster = (Toaster) object;

    return capacity == toaster.capacity && stainless == toaster.stainless
        && extraLarge == toaster.extraLarge;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, stainless, extraLarge);
  }

}
