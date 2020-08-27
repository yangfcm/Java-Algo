package design.singleton;

/**
 * 使用静态内部类实现单例模式 和双重检查一样，这种实现方式也能避免多线程和多实例问题，而且写法更加简明。避免了两个if语句。
 * 外部类(SingleInstance6)的加载不会导致内部类(Single)的加载，保证单实例和懒加载
 * 类的静态属性只会在第一次加载类的时候初始化，保证了线程安全性。
 */
public class SingleInstance6 {

  // private static volatile SingleInstance6 instance;

  private SingleInstance6() {
  }

  // 静态内部类，该类中有一个静态属性SingleInstance6
  private static class Single {
    private static final SingleInstance6 INSTANCE = new SingleInstance6();
  }

  // 使用静态公有方法返回该实例
  public static synchronized SingleInstance6 getInstance() {
    return Single.INSTANCE;
  }
}