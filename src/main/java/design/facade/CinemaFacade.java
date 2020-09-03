package design.facade;

import design.facade.devices.*;

public class CinemaFacade {
  private Audio audio;
  private Light light;
  private Player player;
  private Projector projector;
  private Screen screen;

  public CinemaFacade() {
    audio = Audio.getInstance();
    light = Light.getInstance();
    player = Player.getInstance();
    projector = Projector.getInstance();
    screen = Screen.getInstance();
  }

  public void ready() {
    light.turnOff();
    screen.ready();
    projector.turnOn();
    audio.turnOn();
    player.turnOn();
  }

  public void play() {
    player.play();
    audio.play();
  }

  public void turnUpVolume() {
    audio.turnUp();
  }

  public void turnDownVolume() {
    audio.turnDown();
  }

  public void pause() {
    player.pause();
    audio.pause();
  }

  public void end() {
    player.turnOff();
    audio.turnOff();
    projector.turnOff();
    screen.close();
    light.turnOn();
  }
}
