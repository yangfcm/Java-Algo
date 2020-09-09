package design.observer.good.weather;

import java.util.ArrayList;

import design.observer.good.interfaces.IObserver;
import design.observer.good.interfaces.ISubject;

public class WeatherData implements ISubject {

  private float temperature;
  private float humidity;
  private float pressure;
  private ArrayList<IObserver> observers;

  public WeatherData() {
    this.observers = new ArrayList<IObserver>();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void dataChange() {
    this.notifyObservers();
  }

  public void setData(float temperature, float pressure, float humidity) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    // 将更新后的天气数据推送给接入方。
    dataChange();
  }

  @Override
  public void registerObserver(IObserver o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(IObserver o) {
    if (observers.contains(o)) {
      observers.remove(o);
    }
  }

  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      observers.get(i).update(temperature, pressure, humidity);
    }
  }
}
