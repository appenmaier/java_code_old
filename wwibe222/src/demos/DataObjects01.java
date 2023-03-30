package demos;

/**
 * Variable Datenobjekte
 *
 * @author Daniel Appenmaier
 * 
 */
public class DataObjects01 {

  public static void main(String[] args) {

    /* Deklaration von variablen Datenobjekten */
    int i;
    String name;
    @SuppressWarnings("unused")
    String firstName, familyName, fullName, firstNameAndFamilyName; // Kamelschreibweise
    boolean isHappy;

    /* Initialisierung */
    i = 5;
    name = "Hans Peter";
    isHappy = true;

    char gender = 'M';

    System.out.println("i: " + i);
    System.out.println("name: " + name);
    System.out.println("isHappy: " + isHappy);
    System.out.println("gender: " + gender);
  }

}
