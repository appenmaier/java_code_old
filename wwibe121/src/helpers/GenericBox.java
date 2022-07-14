package helpers;

/**
 * Box
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
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
