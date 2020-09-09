package design.observer.good.interfaces;

public interface IObserver {
  public void update(float temperature, float pressure, float humidity);
}
