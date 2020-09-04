package design.proxy.dynamic;

import design.proxy.dynamic.person.*;

public class App {
  public static void main(String[] args) {
    IPersonDao person = new PersonDao();

    IPersonDao personProxy = (IPersonDao) new ProxyFactory(person).getProxyInstance();

    personProxy.sayHello();
    personProxy.saySomething("Let's play football");

  }
}
