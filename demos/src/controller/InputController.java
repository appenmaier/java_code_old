package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.InputModel;

/**
 * InputController
 * 
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class InputController {

  @FXML
  private TextField inputTextField;

  public void outputInput(ActionEvent event) throws IOException {
    String text = inputTextField.getText();
    System.out.println(text);

    InputModel model = InputModel.getInstance();
    model.setInput(text);

    Parent root = FXMLLoader.load(getClass().getResource("../resources/OutputView.fxml"));
    Scene newScene = new Scene(root);
    Scene currentScene = ((Node) event.getSource()).getScene();
    Stage stage = (Stage) currentScene.getWindow();
    stage.setScene(newScene);
    stage.show();
  }
  /*
   * version 2.0: public void outputInput(ActionEvent event) throws IOException { String text =
   * inputTextField.getText(); System.out.println(text);
   * 
   * Parent root = FXMLLoader.load(getClass().getResource("../resources/OutputView.fxml")); Scene
   * newScene = new Scene(root); Scene currentScene = ((Node) event.getSource()).getScene(); Stage
   * stage = (Stage) currentScene.getWindow(); stage.setScene(newScene); stage.show(); }
   */
  /*
   * version 1.0: public void outputInput(ActionEvent event) { String text =
   * inputTextField.getText(); System.out.println(text); }
   */

}
