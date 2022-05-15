package algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Traverse
 * @description Implement tree data structure and its traverse method(BFS, DFS)
 */
public class Traverse<T> {
  private Tree<T> root;
  private List<Tree<T>> traverseList;  // A list to store the traverse result of a tree.

  public List<Tree<T>> bfs() {
    traverseList = new ArrayList<Tree<T>>();
    var tempList = new ArrayList<Tree<T>>();
    tempList.add(root);
    while(tempList.size() > 0) {
      Tree<T> firstNode = tempList.get(0); // Save the current node.
      tempList.remove(0);

      for (Tree<T> node : firstNode.getChildren()) {
        traverseList.add(node);
      }
    }
    return traverseList;
  }

  public List<Tree<T>> dfs() {
    // @TODO: implement DFS search.

    return traverseList;
  }
}
