package demos;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import demos.student.Student;

/**
 * Assoziativspeicher (Maps)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Maps01 {

  public static void main(String[] args) {

    HashMap<Student, List<Double>> grades = new HashMap<>();

    grades.put(new Student("8172645"), List.of(2.3, 2.6, 1.8));
    grades.put(new Student("9182734"), List.of(1.1, 2.1, 1.7));
    grades.put(new Student("1128406"), List.of(4.1, 2.9));
    grades.put(new Student("8264857"), List.of(2.7, 2.6, 4.2));
    grades.put(new Student("4356632"), List.of(1.7, 1.0, 2.3));
    grades.put(new Student("7762991"), List.of(5.0, 2.8, 1.6));

    List<Double> tmp = grades.get(new Student("8264857"));
    Double grade = tmp.get(0);
    System.out.println(grade);
    // System.out.println(grades.get(new Student("8264857")).get(0));

    System.out.println(grades.containsKey(new Student("4356632")));
    System.out.println(grades.containsValue(List.of(5.0, 2.8, 1.6)));

    List<Double> oldGradesList = grades.put(new Student("1128406"), List.of(4.1, 2.9, 3.6));
    System.out.println(oldGradesList);

    System.out.println(grades);
    System.out.println(grades.keySet());
    System.out.println(grades.values());
    System.out.println(grades.entrySet());

    /* Die Menge aller Schluessel */
    for (Student s : grades.keySet()) {
      System.out.println(s);
    }

    /* All Werte */
    for (List<Double> l : grades.values()) {
      System.out.println(l);
    }

    /* Die Menge aller Schluessel-Wert-Paare (Eintraege) */
    for (Entry<Student, List<Double>> e : grades.entrySet()) {
      System.out.println(e.getKey().getId() + ": " + e.getValue());
    }

  }

}
