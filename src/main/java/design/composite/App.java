package design.composite;

import design.composite.school.*;

public class App {
  static public void main(String[] args) {

    // Create University
    Component university = new University("Flinders University", "Located in Bedford, South Australia");

    // Create college
    Component medCollege = new College("Medicine College", "Medicine College");
    Component infoCollege = new College("Information and Computer College", "Information and Computer College");

    // Create departments under college
    medCollege.add(new Department("General Practice", "General Practice"));
    medCollege.add(new Department("Nursing", "Nursing"));
    infoCollege.add(new Department("Software", "Software"));
    infoCollege.add(new Department("Network", "Network"));
    infoCollege.add(new Department("AI and Big Data", "AI and Big Data"));

    // Add colleges to university
    university.add(medCollege);
    university.add(infoCollege);

    university.print();
  }
}