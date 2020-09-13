package design.mediator.devices;

public abstract class Colleague {
  private AbsMediator mediator;
  public String name;

  public Colleague(AbsMediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  public AbsMediator getMediator() {
    return this.mediator;
  }

  public abstract void sendMessage(int stateChange);
}
