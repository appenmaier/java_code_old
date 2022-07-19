package exercises.java.vehicle.v7;

import java.util.ArrayList;

/**
 * Reisebuero
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class TravelAgency {

	/*
	 * Attribute
	 */
	private String name;
	private ArrayList<Partner> partners;

	/*
	 * Konstruktoren
	 */
	public TravelAgency(String name) {
		this.name = name;
		partners = new ArrayList<>();
	}

	/*
	 * Methoden
	 */
	public void addPartner(Partner partner) {
		partners.add(partner);
	}

	public void print() {
		System.out.println(name);
		for (Partner p : partners) {
			p.print();
		}
	}
}
