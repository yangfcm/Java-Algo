package design.facade.devices;

import design.facade.CinemaFacade;

public class App {
  public static void main(String[] args) {
    CinemaFacade cinema = new CinemaFacade();
    cinema.ready();
    cinema.play();
    cinema.turnUpVolume();
    cinema.turnDownVolume();
    cinema.pause();
    cinema.play();
    cinema.end();
  }
}
