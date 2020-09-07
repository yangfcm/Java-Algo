package design.command;

public class App {
  public static void main(String[] args) {
    Light light = new Light();
    TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
    TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);

    Controller controller = new Controller();
    controller.setCommand(0, turnOnLightCommand, turnOffLightCommand);

    controller.pressTurnOnButton(0); // Turn on light
    controller.pressTurnOffButton(0); // Turn off light
    controller.pressUndoButton(); // Undo turn off light(turn on light)
  }
}
