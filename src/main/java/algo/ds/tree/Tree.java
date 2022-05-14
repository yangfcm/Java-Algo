package algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Tree
 * @description Implement tree data structure and its traverse method(BFS, DFS)
 */
public class Tree<T> {
  private TreeNode<T> root;
  private List<TreeNode<T>> traverseList;  // A list to store the traverse result of a tree.

  public Tree() {
    root = null;
    traverseList = new ArrayList<TreeNode<T>>();
  }

  public List<TreeNode<T>> traverseBfs() {
    traverseList = new ArrayList<TreeNode<T>>();
    var tempList = new ArrayList<TreeNode<T>>();
    tempList.add(root);
    while(tempList.size() > 0) {
      TreeNode<T> firstNode = tempList.get(0); // Save the current node.
      tempList.remove(0);

      for (TreeNode<T> node : firstNode.getChildren()) {
        traverseList.add(node);
      }
    }
    return traverseList;
  }

  public List<TreeNode<T>> traverseDfs() {
    // @TODO: implement DFS search.

    return traverseList;
  }
}
