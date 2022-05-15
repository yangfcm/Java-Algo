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
    traverseList.add(tree.getData());
    tempList.add(tree);
    while(tempList.size() > 0) {
      Tree<Object> firstNode = tempList.get(0); // Save the current node.
      tempList.remove(0);

      for (Tree<Object> childNode : firstNode.getChildren()) {
        traverseList.add(childNode.getData());
        tempList.add(childNode);
      }
    }
    return traverseList;
  }

  public List<Object> dfs() {
    traverseList = new ArrayList<Object>();
    // @TODO: implement DFS search.

    return traverseList;
  }
}
