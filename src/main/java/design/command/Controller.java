package design.command;

public class Controller {
  Command[] turnOnCommands;
  Command[] turnOffCommands;

  Command undoCommand;

  public Controller() {
    turnOnCommands = new Command[5];
    turnOffCommands = new Command[5];
    for (int i = 0; i < 5; i++) {
      turnOnCommands[i] = new VoidCommand();
      turnOffCommands[i] = new VoidCommand();
    }
  }

  public void setCommand(int index, Command turnOnCommand, Command turnOffCommand) {
    turnOnCommands[index] = turnOnCommand;
    turnOffCommands[index] = turnOffCommand;
  }

  public void pressTurnOnButton(int index) {
    turnOnCommands[index].execute();
    undoCommand = turnOnCommands[index];
  }

  public void pressTurnOffButton(int index) {
    turnOffCommands[index].execute();
    undoCommand = turnOffCommands[index];
  }

  public void pressUndoButton() {
    undoCommand.undo();
  }
}
