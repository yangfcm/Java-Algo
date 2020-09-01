package design.composite.school;

import java.util.ArrayList;
import java.util.List;

public class University extends Component {

  List<Component> colleges = new ArrayList<Component>();

  public University(String name, String description) {
    super(name, description);
  }

  @Override
  public void add(Component college) {
    colleges.add(college);
  }

  @Override
  public void remove(Component college) {
    colleges.remove(college);
  }

  @Override
  public void print() {
    System.out.println(getName());
    for (Component college : colleges) {
      college.print();
    }
  }
}