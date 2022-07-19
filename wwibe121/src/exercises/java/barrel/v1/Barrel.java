package exercises.java.barrel.v1;

/**
 * Fass
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Barrel {

	/*
	 * Attribute
	 */
	private int capacity;
	private int fluidLevel;

	/*
	 * Konstruktoren
	 */
	public Barrel(int capacity) {
		this.capacity = capacity;
	}

	/*
	 * Methoden
	 */
	public void addFluidLevel(int value) throws BarrelOverflowException {
		if (fluidLevel + value > capacity) {
			fluidLevel = capacity;
			throw new BarrelOverflowException();
		}

		fluidLevel += value;
	}

	public void printFluidLevel() {
		System.out.println("Fuellstand: " + fluidLevel);
	}

}
