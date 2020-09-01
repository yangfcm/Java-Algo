package design.composite.school;

import java.util.ArrayList;
import java.util.List;

public class College extends Component {
  List<Component> departments = new ArrayList<Component>();

  public College(String name, String description) {
    super(name, description);
  }

  @Override
  public void add(Component department) {
    departments.add(department);
  }

  @Override
  public void remove(Component department) {
    departments.remove(department);
  }

  @Override
  public void print() {
    System.out.println(getName());
    for (Component department : departments) {
      department.print();
    }
  }
}