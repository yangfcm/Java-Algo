package design.visitor;

import java.util.LinkedList;
import java.util.List;

/** 管理多个player及其他们对应的结果 */
public class ObjectStructure {
  private List<Player> players = new LinkedList<>();

  // 增加到列表
  public void attach(Player player) {
    players.add(player);
  }

  // 移除
  public void remove(Player player) {
    players.remove(player);
  }

  // 显示，打印
  public void print(Action action) {
    for (Player p : players) {
      p.accept(action);
    }
  }
}
