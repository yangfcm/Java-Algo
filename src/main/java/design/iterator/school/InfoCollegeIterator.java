package design.iterator.school;

import java.util.Iterator;

public class InfoCollegeIterator implements Iterator {

  Department[] departments;
  int position = 0;

  public InfoCollegeIterator(Department[] departments) {
    this.departments = departments;
  }

  @Override
  public boolean hasNext() {
    if (position >= departments.length || departments[position] == null) {
      return false;
    }
    return true;
  }

  @Override
  public Object next() {
    Department department = departments[position];
    position++;
    return department;
  }

}
