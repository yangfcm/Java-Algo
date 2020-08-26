package design.singleton;

public class SingleInstance5 {
  private static volatile SingleInstance5 instance;

  private SingleInstance5() {

  }

  // 加入双重检查代码，既解决多线程问题也解决多实例的问题
  public static synchronized SingleInstance5 getInstance() {
    if (instance == null) { // 在instance已创建的情况下，后续线程不会在进入下面的同步代码块，解决了多线程问题
      synchronized (SingleInstance5.class) {
        if (instance == null) { // 解决创建多个实例的问题
          instance = new SingleInstance5();
        }
      }
    }
    return instance;
  }
}

/** 分析：解决了懒加载问题同时保证效率，推荐使用这种方法 */