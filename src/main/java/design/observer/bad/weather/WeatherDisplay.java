package design.observer.bad.weather;

/** 天气展示类 */
public class WeatherDisplay {
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
    System.out.println("Today's temperature: " + temperature);
    System.out.println("Today's pressure: " + pressure);
    System.out.println("Today's humidity: " + humidity);
  }
}
