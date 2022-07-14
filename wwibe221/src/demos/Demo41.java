package demos;

import java.util.ArrayList;

import demos.inheritance.v1.LowerClass;
import demos.inheritance.v1.MiddleClass;
import demos.inheritance.v1.UpperClass;

/**
 * Varianz
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo41 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ArrayList<MiddleClass> invariantList;
//		invariantList = new ArrayList<UpperClass>();
		invariantList = new ArrayList<MiddleClass>();
//		invariantList = new ArrayList<LowerClass>();
		invariantList = new ArrayList<>();

		ArrayList<?> bivariantList;
		bivariantList = new ArrayList<UpperClass>();
		bivariantList = new ArrayList<MiddleClass>();
		bivariantList = new ArrayList<LowerClass>();
		bivariantList = new ArrayList<>();

		ArrayList<? extends MiddleClass> covariantList;
//		covariantList = new ArrayList<UpperClass>();
		covariantList = new ArrayList<MiddleClass>();
		covariantList = new ArrayList<LowerClass>();

		ArrayList<? super MiddleClass> contravariantList;
		contravariantList = new ArrayList<UpperClass>();
		contravariantList = new ArrayList<MiddleClass>();
//		contravariantList = new ArrayList<LowerClass>();

	}

}
