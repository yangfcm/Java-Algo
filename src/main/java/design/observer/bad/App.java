package design.observer.bad;

import design.observer.bad.weather.*;

public class App {
  public static void main(String[] args) {
    WeatherDisplay weatherDisplay = new WeatherDisplay();
    WeatherData weatherData = new WeatherData(weatherDisplay);
    weatherData.setData(30, 150, 40);

    weatherData.setData(22, 160, 30);
  }
}

// 这样实现的问题有：每次有新的第三方要接入都需要创建一个对应的第三方的显示对象，并加入到dataChange中，
// 不利于代码维护。
// 而且无法在运行时动态添加第三方的接入。
// 解决这个问题需要观察者模式。