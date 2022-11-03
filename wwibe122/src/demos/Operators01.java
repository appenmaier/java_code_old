package demos;

/**
 * Arithmetische Operatoren
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Operators01 {

  public static void main(String[] args) {

    int a = 5, b = 3, c;

    /* Addition */
    c = a + b;
    System.out.println(a + " + " + b + " = " + c);

    /* Subtraktion */
    c = a - b;
    System.out.println(a + " - " + b + " = " + c);

    /* Multiplikation */
    c = a * b;
    System.out.println(a + " * " + b + " = " + c);

    /* Ganzzahlige Division */
    c = a / b; // ganzzahliger Quotient
    System.out.println(a + " / " + b + " = " + c);
    c = a % b; // Divisionrest (Modulo)
    System.out.println(a + " % " + b + " = " + c);

    /* Division */
    double d = (double) a / b;
    System.out.println(a + " / " + b + " = " + d);

    /* Inkrementieren */
    c = 0;
    c = c + 1;
    c += 1;
    c++;

    System.out.println("c: " + c);

    /* Dekrementieren */
    c = 0;
    c = c - 1;
    c -= 1;
    c--;

    System.out.println("c: " + c);

  }

}
