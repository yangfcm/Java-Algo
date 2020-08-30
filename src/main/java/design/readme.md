Souce code for learning [尚硅谷 - Java 设计模式](https://www.youtube.com/playlist?list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt)

## 单例模式

`/design/singleton`<br>

- 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于需要频繁创建销毁的对象，使用单例模式能提高系统性能。
- 当实例化一个单例类时，必须使用相应的获取对象的方法，而不是使用 new

## 工厂模式

`/design/factory`

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

- 案例 4：
  `factory/case4`

  - 抽象工厂模式介绍：定义一个 Interface 用于创建相关或有依赖关系的对象簇，而无需指明具体的类。是简单工厂模式和工厂方法模式的整合。在实现中，该模式将工厂抽象成两层：抽象工厂和具体实现工厂的子类。开发者可以根据创建对象类型使用对应的工厂子类。这样可以将单个的简单工厂变成工厂簇，更有利于代码的维护和扩展。(将案例 3 的需求用抽象工厂模式实现)

## 原型模式

`/design/prototype`

需求：有一辆车 car1，厂商是 Toyota，型号是 Camery，年份是 2019 年。现需要创建和这辆车属性完全相同的十辆车。

- 原型模式指通过原型实例创建对象的种类，并且通过拷贝这些原型，创建新的对像而无需知道创建的细节。
- 通过 Java 对象`Object`类的`clone()`方法

## 建造者模式

`/design/builder`

顾名思义，建造者模式的的提出是针对造房子的问题来的。例如造房子有打地基，建造和封顶的过程。但建造不同的房子（普通房，高楼，别墅）步骤虽然一样，但具体实现又各不相同。如何使用建造者模式实现并使得代码易于扩展。

使用建造者模式需涉及到四个角色(类)：

- Product 产品 - 需要建造的产品对象，如房子，汽车等。
- Builder 抽象建造者 - 对于创建 Product 对象的各部件指定的接口或抽象类。回答建造这个产品需要哪些部件(property)和流程(method)
- ImpBuilder 具体建造者，建造 House 还是建造 Highrise 还是建造其他类型房子 - 实现接口，即实现抽象建造者里规定的方法。
- Director 指挥者 - 一个使用 Builder 接口的对象，通过这个对象创建产品。
  通过这四个类，实现了隔离客户和对象的生产过程。
