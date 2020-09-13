package design.mediator;

import design.mediator.devices.*;

public class App {
  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    Alarm alarm = new Alarm(mediator, "Alarm");
    Light light = new Light(mediator, "Light");
    Screen screen = new Screen(mediator, "Screen");
    Player player = new Player(mediator, "Player");

    alarm.sendAlarm(0);
    alarm.sendAlarm(1);
  }
}
