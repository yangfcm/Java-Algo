package design.iterator.school;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
  List<ICollege> collegeList;

  public OutputImpl(List<ICollege> collegeList) {
    this.collegeList = collegeList;
  }

  public void printCollege() {
    Iterator<ICollege> iterator = collegeList.iterator();
    while (iterator.hasNext()) {
      ICollege c = (ICollege) iterator.next();
      System.out.println(c.getName());
      printDepartment(c.createIterator()); // Print the departments under the college
    }
  }

  public void printDepartment(Iterator iterator) {
    while (iterator.hasNext()) {
      Department d = (Department) iterator.next();
      System.out.println(d.getName());
    }
  }
}
