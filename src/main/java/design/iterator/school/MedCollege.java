package design.iterator.school;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MedCollege implements ICollege {
  List<Department> departmentList;

  public MedCollege() {
    departmentList = new ArrayList<Department>();
    addDepartment("General Practice", "General Practice");
    addDepartment("Nurcing", "Nurcing");
    addDepartment("Medicine", "Medicine");
  }

  @Override
  public String getName() {
    return "Medical College";
  }

  @Override
  public void addDepartment(String name, String description) {
    Department department = new Department(name, description);
    departmentList.add(department);
  }

  @Override
  public Iterator createIterator() {
    return new MedCollegeIterator(departmentList);
  }
}
