package design.mediator.devices;

public class Player extends Colleague {
  public Player(AbsMediator mediator, String name) {
    super(mediator, name);
    mediator.register(name, this);
  }

  @Override
  public void sendMessage(int stateChange) {
    this.getMediator().getMessage(stateChange, this.name);
  }

  public void turnOn() {
    System.out.println("Turn on player");
  }

  public void turnOff() {
    System.out.println("Turn off player");
  }
}
