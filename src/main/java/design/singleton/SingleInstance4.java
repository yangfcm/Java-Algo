package design.singleton;

/**
 * Same implementation as case 3 but solved the issue of multi-thread
 */
public class SingleInstance4 {
  private static SingleInstance4 instance;

  private SingleInstance4() {

  }

  public static synchronized SingleInstance4 getInstance() {
    if (instance == null) {
      instance = new SingleInstance4();
    }
    return instance;
  }
}

/**
 * 分析: 解决了多线程问题，但导致了代码效率降低即每个线程在想获得类的实例的时候，getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例代码就够了。后面的想获得该实例，直接返回出去就行了
 * 
 */