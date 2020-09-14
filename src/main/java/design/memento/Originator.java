package design.memento;

public class Originator {
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  // 保存状态到Memento
  public Memento saveStateMemento() {
    return new Memento(state);
  }

  // 从Memento中获取状态
  public void getStateFromMemento(Memento memento) {
    state = memento.getState();
  }
}
