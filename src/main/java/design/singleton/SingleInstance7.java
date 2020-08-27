package design.singleton;

/**
 * 枚举模式实现单例 Effective Java作者提倡的方式。
 */
public enum SingleInstance7 {
  INSTANCE;

  public String test() {
    return "test";
  }
}