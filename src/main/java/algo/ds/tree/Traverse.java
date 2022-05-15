package algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Traverse
 * @description Implement two traverse methods(BFS, DFS) for tree.
 */
public class Traverse {
  private static List<Object> traverseList;  // A list to store the traverse result of a tree.

  public static List<Object> bfs(Tree<Object> tree) {
    traverseList = new ArrayList<Object>();
    var tempList = new ArrayList<Tree<Object>>();
    tempList.add(tree);
    while(tempList.size() > 0) {
      Tree<Object> firstNode = tempList.get(0); // Save the current node.
      tempList.remove(0);

      for (Tree<Object> childNode : firstNode.getChildren()) {
        tempList.add(childNode);
      }
      traverseList.add(firstNode.getData());
    }
    return traverseList;
  }

  public static List<Object> dfs(Tree<Object> tree) {
    traverseList = new ArrayList<Object>();
    var tempList = new ArrayList<Tree<Object>>();
    tempList.add(tree);
    while(tempList.size() > 0) {
      Tree<Object> firstNode = tempList.get(0);
      List<Tree<Object>> children = firstNode.getChildren();
      tempList.remove(0);

      for(int i = children.size() - 1; i >= 0; i--) {
        tempList.add(0, children.get(i));
      }
      traverseList.add(firstNode.getData());
    }
    return traverseList;
  }
}
