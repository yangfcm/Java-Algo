package design.command;

public class TurnOffLightCommand implements Command {
  Light light;

  TurnOffLightCommand(Light light) {
    super();
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOff();
  }

  @Override
  public void undo() {
    light.turnOn();
  }
}
