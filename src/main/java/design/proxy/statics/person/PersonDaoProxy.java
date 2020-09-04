package design.proxy.statics.person;

public class PersonDaoProxy implements IPersonDao {

  private IPersonDao person; // 目标对象

  public PersonDaoProxy(IPersonDao person) {
    this.person = person;
  }

  public void sayHello() {
    System.out.println("Tasks before proxy starts");
    person.sayHello();
    System.out.println("Tasks after proxy ends");
  }
}
