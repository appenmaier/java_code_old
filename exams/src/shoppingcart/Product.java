package shoppingcart;

/**
 * Produkt
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Product(String description, double price) implements Sellable {

}
