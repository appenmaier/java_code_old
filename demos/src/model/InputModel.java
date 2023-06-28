package model;

/**
 * InputModel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InputModel {

  private static InputModel instance;

  public static InputModel getInstance() {
    if (instance == null) {
      instance = new InputModel();
    }
    return instance;
  }

  private String input;

  private InputModel() {}

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

}
