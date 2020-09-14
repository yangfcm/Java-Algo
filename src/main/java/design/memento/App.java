package design.memento;

public class App {
  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();

    originator.setState("State #1 - Pending");
    caretaker.add(originator.saveStateMemento()); // Save state #1

    originator.setState("State #2 - Running");
    caretaker.add(originator.saveStateMemento()); // Save state #2.

    originator.setState("State #3 - Complete");
    caretaker.add(originator.saveStateMemento()); // Save state #3.

    // Get the current state
    System.out.println("Current state is: " + originator.getState());

    // Get state #1 (with index of 0)
    originator.getStateFromMemento(caretaker.get(0));
    System.out.println("After retrieving state #1: " + originator.getState());
  }
}
