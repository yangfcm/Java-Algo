package design.proxy.dynamic.person;

public class PersonDao implements IPersonDao {
  public void sayHello() {
    System.out.println("Hello...");
  }

  public void saySomething(String something) {
    System.out.println("What I want to say is: " + something);
  }
}
