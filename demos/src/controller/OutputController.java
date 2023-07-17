package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.InputModel;

/**
 * OutputController
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class OutputController implements Initializable {

  @FXML
  private Label outputLabel;
  /* version 1.0: - */

  public void goBackToInputView(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("../resources/InputView.fxml"));
    Scene newScene = new Scene(root);
    Scene currentScene = ((Node) event.getSource()).getScene();
    Stage stage = (Stage) currentScene.getWindow();
    stage.setScene(newScene);
    stage.show();
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    InputModel model = InputModel.getInstance();
    String text = model.getInput();

    outputLabel.setText(text);
  }
  /* version 1.0: - */

}
/* version 1.0: public class OutputController {...} */
