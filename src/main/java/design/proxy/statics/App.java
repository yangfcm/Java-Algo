package design.proxy.statics;

import design.proxy.statics.person.*;

// 静态代理举例。
// 优点： 在不修改目标对象的功能前提下，能通过代理对象对目标功能扩展。
// 缺点：因为代理对象和目标对象实现一样的接口，所以可能会产生很多代理类。
// 一点接口增加或删除方法，目标对象和代理对象都需要维护。
public class App {
  public static void main(String[] args) {
    PersonDao personDao = new PersonDao();
    PersonDaoProxy personDaoProxy = new PersonDaoProxy(personDao);
    personDaoProxy.sayHello();
  }
}
