package design.iterator.school;

import java.util.Iterator;

public interface ICollege {
  public String getName();

  public void addDepartment(String name, String description);

  public Iterator createIterator();
}
