package design.iterator.school;

import java.util.Iterator;
import java.util.List;

public class MedCollegeIterator implements Iterator {

  List<Department> departmentList;
  int index = -1;

  public MedCollegeIterator(List<Department> departmentList) {
    this.departmentList = departmentList;
  }

  @Override
  public boolean hasNext() {
    if (index >= departmentList.size() - 1) {
      return false;
    }
    index++;
    return true;
  }

  @Override
  public Object next() {
    return departmentList.get(index);
  }

}
