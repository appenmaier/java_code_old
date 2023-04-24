package demos.box;

/**
 * Kiste
 * 
 * @author Daniel Appenmaier
 *
 */
public class GenericBox<T> {

  private T content;

  public GenericBox() {

  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

}
