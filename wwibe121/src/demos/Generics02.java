package demos;

import java.util.ArrayList;

import helpers.LowerClass;
import helpers.MiddleClass;
import helpers.UpperClass;

/**
 * Varianz
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Generics02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ArrayList<MiddleClass> invariantList;
//		invariantList = new ArrayList<UpperClass>();
		invariantList = new ArrayList<MiddleClass>();
//		invariantList = new ArrayList<LowerClass>();

		ArrayList<?> bivariantList;
		bivariantList = new ArrayList<UpperClass>();
		bivariantList = new ArrayList<MiddleClass>();
		bivariantList = new ArrayList<LowerClass>();

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
