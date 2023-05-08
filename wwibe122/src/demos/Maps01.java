package demos;

import java.util.HashMap;
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

    HashMap<Student, Double> grades = new HashMap<>();

    grades.put(new Student("8172645"), 2.4);
    grades.put(new Student("9192360"), 4.1);
    grades.put(new Student("1293700"), 1.2);
    grades.put(new Student("2715347"), 5.0);
    grades.put(new Student("6729385"), 1.8);
    grades.put(new Student("7162509"), 2.8);

    System.out.println(grades.get(new Student("6729385")));
    System.out.println(grades.get(new Student("8216324")));

    System.out.println(grades.containsKey(new Student("6729385")));
    System.out.println(grades.containsValue(1.8));

    System.out.println(grades.put(new Student("6729385"), 1.7));
    System.out.println(grades.get(new Student("6729385")));

    /* Menge aller Schluessel */
    for (Student s : grades.keySet()) {
      System.out.println(s.getMatriculationNumber() + " [ ]");
    }
    System.out.println();

    /* Alle Werte */
    double total = 0;
    int size = 0;
    for (Double d : grades.values()) {
      total += d;
      size++;
    }
    System.out.println(total / size);
    System.out.println();

    /* Menge aller Eintraege (Schluessel-Wert-Paare) */
    for (Entry<Student, Double> entry : grades.entrySet()) {
      Student student = entry.getKey();
      Double grade = entry.getValue();
      System.out.println(student.getMatriculationNumber() + ": " + grade);
    }
    System.out.println();

    /* Die forEach-Methode */
    grades.forEach(
        (student, grade) -> System.out.println(student.getMatriculationNumber() + ": " + grade));

  }

}
