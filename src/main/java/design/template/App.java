package design.template;

import design.template.SoyMilk.*;

public class App {
  public static void main(String[] args) {
    System.out.println("-----Make black bean salt soy milk-----");
    SoyMilk soyMilk1 = new BlackbeanSaltSoyMilk();
    soyMilk1.make();

    System.out.println("-----Make peanut sweet soy milk-----");
    SoyMilk soyMilk2 = new PeanutSweetSoyMilk();
    soyMilk2.make();

    System.out.println("-----Make pure soy milk-----");
    SoyMilk soyMilk3 = new PureSoyMilk();
    soyMilk3.make();
  }
}
