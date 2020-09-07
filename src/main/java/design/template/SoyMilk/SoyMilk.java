package design.template.SoyMilk;

public abstract class SoyMilk {
  public final void make() {
    // 模板方法, 在这里定义执行的方法和步骤
    this.getSoybean();
    if (hasMaterial()) {
      this.getMaterial();
    }
    if (hasIngredient()) {
      this.getIngredient();
    }
    this.mix();
    this.produce();
  }

  private void getSoybean() {
    System.out.println("Get soybean");
  }

  public abstract void getMaterial();
  // 选材，制作豆浆时，可以选择不同的材料，具体选择怎样的材料由子类实现

  public abstract void getIngredient();
  // 添加配料，可以选择不同的配料，具体选择什么配料由子类实现

  private void mix() {
    // 浸泡，这个方法对于制作所有豆浆都是一致的
    System.out.println("Add water and mix materials");
  }

  private void produce() {
    // 制作豆浆
    System.out.println("Produce soy milk");
  }

  public boolean hasMaterial() {
    return true;
  }

  public boolean hasIngredient() {
    return true;
  }
  // hasMaterial and hasIngredient
  // 称为钩子方法，允许子类覆盖，这样当我们不需要其他材料或配料时，将他覆盖并返回false，这样更增加了这个类的灵活性。

}
