package exams.exam2020q1.task03;

import java.util.Random;

public class ExamTask03 {

  private static int counter;
  private static int[] data;

  public static void main(String[] args) {
    Random rd = new Random();
    data = new int[1000000];
    for (int i = 0; i < 1000000; i++) {
      int randomNumber = rd.nextInt(100) + 1;
      data[i] = randomNumber;
    }
    insertSort();
  }

  private static void insertSort() {
    int tmp = 0;
    int i = 1;

    while (i < data.length) {
      counter++;
      int j = i;
      tmp = data[j];
      while (j > 0 && data[j - 1] > tmp) {
        data[j] = data[j - 1];
        j--;
      }
      data[j] = tmp;
      print();
      i++;
    }
  }

  private static void print() {
    System.out.println("Durchlauf: " + counter);
    int i = 0;
    while (i < data.length) {
      System.out.println(data[i]);
      i++;
    }
    // for (int i = 0; i < data.length; i++) {
    // System.out.println(data[i]);
    // }
  }

}
