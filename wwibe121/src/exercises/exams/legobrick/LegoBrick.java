package exercises.exams.legobrick;

public abstract class LegoBrick extends Lego {

  private final int[] dimensions;
  private final String color;

  public LegoBrick(int id, int[] dimensions, String color) {
    super(id);
    this.dimensions = dimensions;
    this.color = color;
  }

  public String color() {
    return color;
  }

  public int[] getDimensions() {
    return dimensions;
  }

}
