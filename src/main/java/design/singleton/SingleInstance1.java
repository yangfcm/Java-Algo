package design.singleton;

/**
 * Implement Signleton design patterns, case 1 - 1.Create an instance inside the
 * class 2. Create a private constructor 3. Expose a static method (getInstance)
 */
public class SingleInstance1 {

  // 1.Create an instance inside the class
  private final static SingleInstance1 instance = new SingleInstance1();

  private SingleInstance1() { // 2. Create a private constructor
    /** Put instantiation code here */
  }

  public static SingleInstance1 getInstance() { // 3. Expose a static method (getInstance)
    return instance;
  }
}

/**
 * 分析： 在类装载时就完成了实例化，实现简单， 但是没有Lazy loading 效果，可能会造成内存浪费 适用于单线程开发，不适合于多线程
 */