package design.command;

public class TurnOnLightCommand implements Command {
  Light light;

  TurnOnLightCommand(Light light) {
    super();
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }

  @Override
  public void undo() {
    light.turnOff();
  }
}
