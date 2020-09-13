package design.mediator.devices;

public class Screen extends Colleague {
  public Screen(AbsMediator mediator, String name) {
    super(mediator, name);
    mediator.register(name, this);
  }

  @Override
  public void sendMessage(int stateChange) {
    this.getMediator().getMessage(stateChange, this.name);
  }

  public void ready() {
    System.out.println("Screen is ready");
  }
}
