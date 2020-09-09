package design.observer.bad.weather;

/**
 * 气象数据类， 当有数据更新时，就调用weatherDisplay的update方法,实现将最新的天气信息推送给客户端。
 */
public class WeatherData {
  private float temperature;
  private float humidity;
  private float pressure;
  private WeatherDisplay weatherDisplay;

  public WeatherData(WeatherDisplay weatherDisplay) {
    this.weatherDisplay = weatherDisplay;
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
    // 通过调用接入方的update方法实现将天气数据推送给它。
    weatherDisplay.update(getTemperature(), getPressure(), getHumidity());
  }

  public void setData(float temperature, float pressure, float humidity) {
    this.temperature = temperature;
    this.pressure = pressure;
    this.humidity = humidity;
    // 将更新后的天气数据推送给接入方。
    dataChange();
  }

}
