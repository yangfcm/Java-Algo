package design.singleton;

/** An improvement on SingleInstance1 and SingleInstance2 */
public class SingleInstance3 {
  private static SingleInstance3 instance;

  private SingleInstance3() {

  }

  public static SingleInstance3 getInstance() {
    if (instance == null) { // Only when instance is not created, do the instantiation.
      instance = new SingleInstance3();
    }
    return instance;
  }

}

/**
 * 分析：起到了Lazy loading的效果。但是只能在单线程下使用。
 * 如果在多线程情况下，一个线程进入了if判断，还没来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 所在在实际开发中，这种模式使用不多。
 */