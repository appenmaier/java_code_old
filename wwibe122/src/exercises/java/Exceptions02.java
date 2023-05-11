package exercises.java;

import exercises.java.barrel.Barrel;
import exercises.java.barrel.BarrelOverflowException;

public class Exceptions02 {

  public static void main(String[] args) {

    Barrel barrel = new Barrel(100);

    try {
      barrel.addFluid(50);
      barrel.addFluid(51);
    } catch (BarrelOverflowException e) {
      System.err.println(e.getMessage());
    }
    barrel.printFluidLevel();

  }

}
