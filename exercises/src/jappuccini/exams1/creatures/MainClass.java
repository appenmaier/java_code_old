package jappuccini.exams1.creatures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Creature> creatures =
        CreaturesReader.getCreatures(new File("src/jappuccini/exams1/creatures/creatures.txt"));

    System.out.println("Alle Kreaturen: " + creatures);

  }

}
