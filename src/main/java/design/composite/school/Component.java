package design.composite.school;

public abstract class Component {
  private String name;
  private String description;

  public Component(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void add(Component component) {
  }

  protected void remove(Component component) {
  }

  public String getName() {
    return name;
  }

  public void SetName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public abstract void print();

}