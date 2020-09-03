package design.flyweight.article;

public class Article extends AbsArticle {
  private String platform = ""; // The platform where the article is published.

  public Article(String platform) {
    super();
    this.platform = platform;
  }

  @Override
  public String getInfo(User user) {
    return "This article is published on " + platform + ". It's read by " + user.getName();
  }
}
