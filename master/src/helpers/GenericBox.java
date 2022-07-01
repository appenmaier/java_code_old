package helpers;

/**
 * Generische Box
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class GenericBox<T> {

	/*
	 * Attribute
	 */
	private T content;

	/*
	 * Setter und Getter
	 */
	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

}
