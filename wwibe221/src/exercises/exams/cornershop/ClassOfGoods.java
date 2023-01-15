package exercises.exams.cornershop;

public enum ClassOfGoods {

  BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Obst"), VEGETABLES(
      "Gemuese");

  private final String description;

  ClassOfGoods(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
