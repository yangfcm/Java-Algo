package design.mediator.devices;

public class Alarm extends Colleague {
  public Alarm(AbsMediator mediator, String name) {
    super(mediator, name);
    mediator.register(name, this);
  }

  public void sendAlarm(int stateChange) {
    sendMessage(stateChange);
  }

  @Override
  public void sendMessage(int stateChange) {
    this.getMediator().getMessage(stateChange, this.name);
  }
}
