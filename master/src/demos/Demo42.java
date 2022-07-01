package demos;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.Parent;

/**
 * Varianz
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Demo42 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ArrayList<?> bivariantList;
		bivariantList = new ArrayList<Object>();
		bivariantList = new ArrayList<Node>();
		bivariantList = new ArrayList<Parent>();

		ArrayList<? extends Node> covariantList;
//      covariantList = new ArrayList<Object>();
		covariantList = new ArrayList<Node>();
		covariantList = new ArrayList<Parent>();

		ArrayList<? super Node> contravariantList;
		contravariantList = new ArrayList<Object>();
		contravariantList = new ArrayList<Node>();
//		contravariantList = new ArrayList<Parent>();

		ArrayList<Node> invariantList;
//		invariantList = new ArrayList<Object>();
		invariantList = new ArrayList<Node>();
//		invariantList = new ArrayList<Parent>();

	}

}
