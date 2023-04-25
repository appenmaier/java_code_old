package exercises.java.vehicle;

import java.util.ArrayList;

/**
 * Reisebuero
 * 
 * @author Daniel Appenmaier
 *
 */
public class TravelAgency {

  private String name;
  private ArrayList<Partner> partners;

  public TravelAgency(String name) {
    super();
    this.name = name;
    partners = new ArrayList<>();
  }

  public void addPartner(Partner partner) {
    partners.add(partner);
  }

  public void print() {
    System.out.println(name);
    System.out.println("Unsere Partner:");
    for (Partner p : partners) {
      p.print();
    }
  }

}
