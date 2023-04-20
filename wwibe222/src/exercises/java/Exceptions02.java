package exercises.java;

import exercises.java.barrel.Barrel;
import exercises.java.barrel.BarrelOverflowException;

public class Exceptions02 {

  public static void main(String[] args) {

    Barrel barrel = new Barrel(100);

    try {
      barrel.addFluid(50);
      barrel.printFluidLevel();
      barrel.addFluid(51);
      barrel.printFluidLevel();
      barrel.addFluid(2);
      barrel.printFluidLevel();
    } catch (BarrelOverflowException e) {
      e.printStackTrace();
    }

  }

}
