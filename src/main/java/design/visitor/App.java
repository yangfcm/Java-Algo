package design.visitor;

public class App {
  public static void main(String[] args) {
    var objectStructure = new ObjectStructure();

    objectStructure.attach(new MalePlayer());
    objectStructure.attach(new FemalePlayer());
    objectStructure.attach(new FemalePlayer());

    objectStructure.print(new SuccessAction());
    objectStructure.print(new FailAction());
  }
}
