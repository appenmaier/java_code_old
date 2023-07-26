package jappuccini.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import jappuccini.model.Student;

/**
 * IOStreams01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E710_IOStreams01 {

  private static File file;
  private static ArrayList<Student> students;

  public static void main(String[] args) throws IOException {

    file = new File("src/resources/students.txt");
    if (!file.exists()) {
      file.createNewFile();
    }

    students = new ArrayList<>();

    Student student1 = new Student("8172093", "Hans Maier", 'm');
    Student student2 = new Student("2335409", "Peter Mueller", 'm');
    Student student3 = new Student("5065411", "Lisa Schmid", 'w');

    students.add(student1);
    students.add(student2);
    students.add(student3);

    write();

    students.clear();

    read();

    students.forEach(System.out::println);

  }

  public static void read() {
    try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String[] tokens = line.split(";");
        String id = tokens[0];
        String name = tokens[1];
        char gender = tokens[2].charAt(0);
        Student student = new Student(id, name, gender);
        students.add(student);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void write() {
    try (FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      for (Student s : students) {
        String line = s.id() + ";" + s.name() + ";" + s.gender();
        bufferedWriter.write(line);
        bufferedWriter.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
