package design.iterator.school;

import java.util.Iterator;

public class InfoCollege implements ICollege {

  Department[] departments;
  int numberOfDepartments = 0;

  public InfoCollege() {
    departments = new Department[3];
    addDepartment("Software Engineering", "Software Engineering");
    addDepartment("Web Security", "Web Security");
    addDepartment("AI and Big Data", "AI and Big Data");
  }

  @Override
  public String getName() {
    return "Information College";
  }

  @Override
  public void addDepartment(String name, String description) {
    Department department = new Department(name, description);
    departments[numberOfDepartments] = department;
    numberOfDepartments++;
  }

  @Override
  public Iterator createIterator() {
    return new InfoCollegeIterator(departments);
  }

}
