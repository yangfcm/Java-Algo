package design.flyweight.article;

import java.util.HashMap;

public class ArticleFactory {
  private HashMap<String, Article> pool = new HashMap<>();

  // 根据文章发布的平台，返回一篇文章，如果没有就创建，并放入池中
  public Article getArticle(String platform) {
    if (!pool.containsKey(platform)) {
      pool.put(platform, new Article(platform));
    }
    return (Article) pool.get(platform);
  }

  public int getArticleCount() {
    return pool.size();
  }
}
