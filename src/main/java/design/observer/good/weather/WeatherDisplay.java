package design.observer.good.weather;

import design.observer.good.interfaces.*;

public class WeatherDisplay implements IObserver {
  private float temperature;
  private float humidity;
  private float pressure;

  // Update weather data and display it.
  public void update(float temperature, float pressure, float humidity) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("The latest weather:");
    System.out.println("Temperature: " + temperature);
    System.out.println("Pressure: " + pressure);
    System.out.println("Humidity: " + humidity);
  }
}
