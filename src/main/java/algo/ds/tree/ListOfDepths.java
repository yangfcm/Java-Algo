package algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @name ListOfDepths
 * @description  Given a binary(not necessarily balanced) tree, create an array/list of all the nodes at each level.
 * If you have a tree with N levels, you'll have N arrays/lists.
 * @Example
 * Given:
 *      0
 *    /   \
 *   1     3
 *  / \   /
 * 4  6  5
 * Answer: [[Node(0)], [Node(1), Node(3)], [Node(4), Node(6), Node(5)]]
 */
public class ListOfDepths {
  public static List<List<Bst>> solution1(Bst root) {
    List<List<Bst>> lists = new ArrayList<List<Bst>>();
    createLevelListHelper(root, lists, 0);
    return lists;
  }

  private static void createLevelListHelper(Bst root, List<List<Bst>> lists, int level ) {
    if(root == null) return;
    List<Bst> list;
    if(lists.size() == level) {
      list = new ArrayList<Bst>();
      lists.add(list);
    } else {
      list = lists.get(level);
    }
    list.add(root);
    createLevelListHelper(root.getLeft(), lists, level + 1);
    createLevelListHelper(root.getRight(), lists, level + 1);
  }

  public static List<List<Bst>> solution2(Bst root) {
    List<List<Bst>> lists = new ArrayList<List<Bst>>();
    List<Bst> current = new ArrayList<Bst>();
    if(root != null) {
      current.add(root);
    }
    while(current.size() > 0) {
      lists.add(current);
      var parents = current;
      current = new ArrayList<Bst>();
      for(Bst parent : parents) {
        if(parent.getLeft() != null) current.add(parent.getLeft());
        if(parent.getRight() != null) current.add(parent.getRight());
      }
    }
    return lists;
  }
}
