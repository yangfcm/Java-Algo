需求：

- 能够订购多个种类的披萨如 Cheese pizza, chicken pizza.
- 实现不同披萨的制作过程：prepare, bake, cut, pack

- 案例 1：
  `/factory/case1`

  - 设计 Pizza 抽象类，不同种类的 pizza 继承这个类，在主程序中根据不同种类调用不同的 Pizza 类。（不采用设计模式）

  - 结论：
    - 简单直接
    - 违反了设计模式原则，不易扩展。

- 案例 2：
  `/factory/case2`

  - 保留原来的 Pizza 类，另外定义一个创建对象的类，由这个类来封装实例化对象的行为。

  - 结论：
    - 使用（简单）工厂模式：由一个工厂对象来决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的一种。
    - 当需要大量创建某种对象时，就需要使用工厂模式。

- 案例 3：
  `factory/case3`
  - 需求：在订购披萨时还可以点不同披萨店制作的不同口味的披萨。例如 Domino 的 cheese pizza 或者 Pizzahut 的 Chicken pizza。如果仍然使用简单工厂模式，就需要对不同的披萨店创建不同的工厂类，但这样的实现扩展性，可维护性都不好。于是我们需要使用工厂方法模式。
  - 工厂方法模式介绍：定义一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。
  - 实现：为不同披萨店的不同口味披萨创建一个类，例如：`DominoCheesePizza`, `DominoChickenPizza`,`PizzahutCheesePizza`, `PizzahutChickenPizza` 继承于 Pizza 类。在`OrderPizza`类中定义`createPizza()`抽象方法，由其子类`OrderPizzahutPizza`和`OrderDominoPizza`来实现该方法。如果用户想订哪家店的 pizza 就调用那家的 Order 类。
