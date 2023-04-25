package helpers;

/**
 * Rechner
 * 
 * @author Daniel Appenmaier
 * 
 */
public class Calculator {

  /**
   * Mehrwertsteuersatz
   */
  final static double VAT = 0.19;

  /**
   * Ermaessigter Mehrwertsteuersatz
   */
  final static double REDUCED_VAT = 0.07;

  /**
   * Umrechnung: Netto in Brutto
   * 
   * @param netAmountInDM Nettobetrag
   * @param isReducedVAT Ermaessigter Mehrwertsteuersatz
   * @return Bruttobetrag
   */
  public static double addVAT(double netAmount, boolean isReducedVAT) {
    double totalAmount;

    if (isReducedVAT) {
      totalAmount = netAmount + netAmount * REDUCED_VAT;
    } else {
      totalAmount = netAmount + netAmount * VAT;
    }

    return totalAmount;
  }

  public static int calculateSumWithDoWile(int start, int end) {
    int i = start;
    int total = 0;

    do {
      total += i;
      i++;
    } while (i <= end);

    return total;
  }

  public static int calculateSumWithFor(int start, int end) {
    int total = 0;

    for (int i = start; i <= end; i++) {
      total += i;
    }

    return total;
  }

  public static int calculateSumWithWile(int start, int end) {
    int i = start;
    int total = 0;

    while (i <= end) {
      total += i;
      i++;
    }

    return total;
  }

  /**
   * Umrechnung: DM in Euro
   * 
   * @param amountInDM Betrag in DM
   * @return Betrag in Euro
   */
  public static double exchangeDMToEuro(double amountInDM) {
    double amountInEUR;
    double exchangeRateFromEURToDM = 1.95583;

    amountInEUR = amountInDM / exchangeRateFromEURToDM;

    return amountInEUR;
  }

  /**
   * Umrechnung: Euro in DM
   * 
   * @param amountInEuro Betrag in Euro
   * @return Betrag in DM
   */
  public static double exchangeEuroToDM(double amountInEuro) {
    double amountInDM;
    double exchangeRateFromEURToDM = 1.95583;

    amountInDM = amountInEuro * exchangeRateFromEURToDM;

    return amountInDM;
  }

  /**
   * Gibt zurueck, ob ein eingehendes Dreieck rechtwinklig ist oder nicht
   * 
   * @param x Seite 1
   * @param y Seite 2
   * @param z Seite 3
   * @param tolerancy Toleranz
   * 
   * @return ist rechtwinklig
   */
  public static boolean isRightTriangle(double x, double y, double z, double tolerancy) {
    double a, b, c;

    if (x > y && x > z) {
      a = y;
      b = z;
      c = x;
    } else if (y > x && y > z) {
      a = x;
      b = z;
      c = y;
    } else {
      a = x;
      b = y;
      c = z;
    }

    double c2 = c * c;
    double a2b2 = a * a + b * b;
    if (Math.abs(c2 - a2b2) < tolerancy) {
      return true;
    } else {
      return false;
    }
  }

}
