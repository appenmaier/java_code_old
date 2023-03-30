package helpers;

/**
 * Zahlenfeld
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 * 
 */
public class IntegerArray {

  /**
   * Gibt ein Zahlenfeld auf der Konsole aus
   * 
   * @param array Zahlenfeld
   * @param vertical vertikale Ausgabe
   */
  public static void printArray(int[] array, boolean vertical) {
    if (vertical) {
      for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      }
    } else {
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
        System.out.print(i == array.length - 1 ? array[i] : array[i] + ", ");
      }
      System.out.println("]");
    }
  }

  /**
   * Gibt ein Zahlenfeld inklusive Indizes auf der Konsole aus
   * 
   * @param array Zahlenfeld
   */
  public static void printArrayWithIndices(int[] array, boolean vertical) {
    if (vertical) {
      for (int i = 0; i < array.length; i++) {
        System.out.println("i: " + array[i]);
      }
    } else {
      System.out.print(" ");
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%3d ", i);
      }
      System.out.println();
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%3d ", i == array.length - 1 ? array[i] : array[i]);
      }
      System.out.println("]");
    }
  }

  /**
   * Durchsucht ein Zahlenfeld nach einem eingehenden Wert und gibt, fuer den Fall, dass der Wert
   * gefundenden wurde, den Index des eingehenden Wertes zurueck. Sollte der eingehende Wert nicht
   * gefunden werden, wir -1 zurueckgegeben
   * 
   * @param array Zahlenfeld
   * @param value Wert
   * 
   * @return Index
   */
  public static int getIndex(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }

    return -1;
  }

  /**
   * Erzeugt ein Zahlenfeld mit pseudozufaelligen Werten
   * 
   * @param length Laenge des Zahlenfeldes
   * @param limit Grenzwert der Pseudozufallszahlen
   * 
   * @return Zahlenfeld
   */
  public static int[] createArray(int length, int limit) {
    int[] array = new int[length];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * limit);
    }

    return array;
  }

  /**
   * Tauscht zwei Werte in einem Zahlenfeld
   * 
   * @param array Zahlenfeld
   * @param index1 Index 1
   * @param index2 Index 2
   */
  public static void swapValues(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }

  /**
   * Kehrt ein Zahlenfeld um
   * 
   * @param array Zahlenfeld
   */
  public static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      swapValues(array, i, array.length - 1 - i);
    }
  }

  /**
   * Gibt eine Kopie des eingehenden Zahlenfeldes zurueck
   * 
   * @param array Zahlenfeld
   * 
   *        return Zahlenfeld
   */
  public static int[] copyArray(int[] array) {
    int[] copy = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      copy[i] = array[i];
    }

    return copy;
  }

  /**
   * Gibt den groessten Wert des eingehenden Zahlenfeldes zurueck
   * 
   * @param array Zahlenfeld
   * 
   * @return Groesster Wert
   */
  public static int getMaxValue(int[] array) {
    int maxValue = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxValue) {
        maxValue = array[i];
      }
    }

    return maxValue;
  }

  /**
   * Gibt den kleinsten Wert des eingehenden Zahlenfeldes zurueck
   * 
   * @param array Zahlenfeld
   * 
   * @return Kleinster Wert
   */
  public static int getMinValue(int[] array) {
    int minValue = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
      }
    }

    return minValue;
  }

  /**
   * Gibt den Index des groessten Wertes des eingehenden Zahlenfeldes zurueck
   * 
   * @param array Zahlenfeld
   * 
   * @return Index
   */
  public static int getMaxValueIndex(int[] array) {
    int maxValue = 0;
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > maxValue) {
        maxValue = array[i];
        index = i;
      }
    }

    return index;
  }

  /**
   * Gibt den Index des kleinsten Wertes des eingehenden Zahlenfeldes zurueck
   * 
   * @param array Zahlenfeld
   * 
   * @return Index
   */
  public static int getMinValueIndex(int[] array) {
    int minValue = Integer.MAX_VALUE;
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] < minValue) {
        minValue = array[i];
        index = i;
      }
    }

    return index;
  }

  /**
   * Durchsucht ein Zahlenfeld nach einem eingehenden Wert und gibt, fuer den Fall, dass der Wert
   * gefundenden wurde, den Index des eingehenden Wertes zurueck. Sollte der eingehende Wert nicht
   * gefunden werden, wir -1 zurueckgegeben
   * 
   * @param array Zahlenfeld
   * @param value Wert
   * 
   * @return Index
   */
  public static int getIndexWithBinarySearch(int[] array, int value, boolean printLRC) {
    int l = 0;
    int r = array.length - 1;
    int c;

    if (printLRC) {
      System.out.println("  l   r   c");
    }

    while (l <= r) {
      c = (l + r) / 2;
      if (printLRC) {
        System.out.printf("%3d %3d %3d%n", l, r, c);
      }
      if (array[c] == value) {
        return c;
      } else if (array[c] > value) {
        r = c - 1;
      } else {
        l = c + 1;
      }
    }

    return -1;
  }

  /**
   * Sortiert ein Zahlenfeld mit Hilfe des Selection-Sort-Algorithmus
   * 
   * @param numbers Zahlenfeld
   */
  public static void sortWithSelectionSort(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
      int mininumPosition = i;
      int minimumValue = numbers[mininumPosition];
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] < minimumValue) {
          mininumPosition = j;
          minimumValue = numbers[mininumPosition];
        }
      }

      if (mininumPosition != i) {
        numbers[mininumPosition] = numbers[i];
        numbers[i] = minimumValue;
      }
    }
  }

}
