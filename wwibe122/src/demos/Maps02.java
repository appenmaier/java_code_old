package demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import demos.student.Student;

/**
 * Assoziativspeicher (Maps) 2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Maps02 {

  public static void main(String[] args) {

    HashMap<Student, ArrayList<Double>> grades = new HashMap<>();

    grades.put(new Student("8271632"), new ArrayList<>(List.of(1.2, 3.4, 2.5)));
    grades.put(new Student("9172543"), new ArrayList<>(List.of(2.8, 3.2, 2.7)));

    for (Entry<Student, ArrayList<Double>> entry : grades.entrySet()) {
      Student student = entry.getKey();
      ArrayList<Double> values = entry.getValue();
      System.out.println(student.getMatriculationNumber());
      for (Double v : values) {
        System.out.println(v);
      }
      System.out.println();
    }

  }

}
