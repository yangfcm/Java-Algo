package design.command;

public interface Command {
  // Execute the command
  public void execute();

  // Undo the execution of command
  public void undo();
}
