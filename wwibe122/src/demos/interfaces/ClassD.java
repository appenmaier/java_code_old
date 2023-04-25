package demos.interfaces;

public class ClassD extends ClassC implements InterfaceA, InterfaceB, InterfaceC {

  @Override
  public void methodA() {

  }

  @Override
  public void methodB() {

  }

  @Override
  public void methodC() {

  }

  @Override
  public void print() {
    super.print();
    System.out.println("D");
  }

}
