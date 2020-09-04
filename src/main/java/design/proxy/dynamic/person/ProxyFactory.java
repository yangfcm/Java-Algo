package design.proxy.dynamic.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class ProxyFactory {
  // 需要代理的目标对象
  private Object target;

  public ProxyFactory(Object target) {
    this.target = target;
  }

  // 为目标对象生成一个代理对象
  public Object getProxyInstance() {
    /**
     * Proxy.newProxyInstance参数说明： 1. ClassLoader loader:
     * 指定当前目标对象使用的类加载器，获取加载器的方法是固定的 2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
     * 3. InvocationHandler h: 事件处理，执行目标对象的方法时，会把当前执行的目标对象方法作为参数传入。
     */
    return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args)
              throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            // 执行目标对象
            System.out.println("Tasks to do before proxy");
            Object returnVal = method.invoke(target, args); // 执行目标对象的方法
            System.out.println("Tasks to do after proxy");
            return returnVal;
          }
        });
  }
}
