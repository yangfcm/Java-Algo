package design.flyweight;

import design.flyweight.article.*;

public class App {
  public static void main(String[] args) {
    ArticleFactory articleFactory = new ArticleFactory();

    Article article1 = articleFactory.getArticle("blog");
    System.out.println(article1.getInfo(new User("Tom")));

    Article article2 = articleFactory.getArticle("facebook");
    System.out.println(article2.getInfo(new User("Jack")));

    Article article3 = articleFactory.getArticle("facebook");
    System.out.println(article3.getInfo(new User("Alice")));

    System.out.println(articleFactory.getArticleCount()); // 2
  }
}
