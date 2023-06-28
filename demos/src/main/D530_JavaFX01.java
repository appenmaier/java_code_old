package main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Lebenszyklus einer JavaFX-Anwendung
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D530_JavaFX01 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void init() throws Exception {
    System.out.println("init()");
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    System.out.println("start()");
    primaryStage.setTitle("JavaFX");
    primaryStage.show();
  }

  @Override
  public void stop() throws Exception {
    System.out.println("stop()");
  }

}
