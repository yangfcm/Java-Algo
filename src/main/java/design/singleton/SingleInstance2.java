package design.singleton;

/**
 * Implement Signleton design patterns, case 2 - The implementation is the same
 * as case 1. The only difference is just move the instantination to a static
 * code block.
 */
public class SingleInstance2 {

  // 1.Declare an instance inside the class but do not instantiate it.
  private static SingleInstance2 instance;

  private SingleInstance2() { // 2. Create a private constructor
    /** Put instantiation code here */
  }

  static { // Implement instantiating in static block.
    instance = new SingleInstance2();
  }

  public static SingleInstance2 getInstance() { // 3. Expose a static method (getInstance)
    return instance;
  }
}

/**
 * 分析： 在类装载时就完成了实例化，实现简单， 但是没有Lazy loading 效果，可能会造成内存浪费
 */