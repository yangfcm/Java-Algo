package design.mediator.devices;

public class Light extends Colleague {
  public Light(AbsMediator mediator, String name) {
    super(mediator, name);
    mediator.register(name, this);
  }

  public void sendLightMessage(int stateChange) {
    sendMessage(stateChange);
  }

  @Override
  public void sendMessage(int stateChange) {
    this.getMediator().getMessage(stateChange, this.name);
  }

  public void turnOn() {
    System.out.println("Turn on light");
  }
}
