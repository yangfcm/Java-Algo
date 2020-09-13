package design.iterator;

import java.util.ArrayList;
import java.util.List;

import design.iterator.school.*;

public class App {
  public static void main(String[] args) {
    List<ICollege> collegeList = new ArrayList<ICollege>();

    InfoCollege infoCollege = new InfoCollege();
    MedCollege medCollege = new MedCollege();

    collegeList.add(infoCollege);
    collegeList.add(medCollege);

    var outputImpl = new OutputImpl(collegeList);
    outputImpl.printCollege();
  }
}
