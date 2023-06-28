package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Szenenwechsel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D560_SceneSwitching extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("../resources/InputView.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setTitle("JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
