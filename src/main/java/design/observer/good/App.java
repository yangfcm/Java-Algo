package design.observer.good;

import design.observer.good.weather.*;

public class App {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();
    WeatherDisplay weatherDisplay = new WeatherDisplay();

    weatherData.registerObserver(weatherDisplay);
    weatherData.setData(30, 150, 40);
    weatherData.setData(22, 160, 30);
  }
}
