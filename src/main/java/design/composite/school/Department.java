package design.composite.school;

public class Department extends Component {
  public Department(String name, String description) {
    super(name, description);
  }

  @Override
  public void print() {
    System.out.println(getName());
  }
}