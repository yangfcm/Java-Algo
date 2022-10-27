package algo.ds.tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @name LevelWidth
 * @description Given the root node of a tree, return an array to show the width of each level.
 * @example
 * Given:
 *     0
 *   / |  \
 * 1   2   3
 * |       |
 * 4       5
 * Answer: [1, 3, 2]
 */
public class LevelWidth {
  public static int[] solution(Tree<Integer> root) {
    var nodesList = new ArrayList<Tree<Integer>>(Arrays.asList(root, null));  // null is a stop sign to indicate the end of a level
    var widths = new ArrayList<Integer>();  // The list to hold the width of each level.
    widths.add(0);

    while(nodesList.size() > 1) { // If nodesList has only one element i.e. null, it means the traversal of the tree is finished.
      var node = nodesList.remove(0);
      if(node == null) {
        // If the first node is null, it means it reaches the end of the level
        widths.add(0);
        nodesList.add(null);  // Put null as stop sign to the end of the list.
      } else {
        nodesList.addAll(node.getChildren());
        widths.set(widths.size() - 1, widths.get(widths.size() - 1) + 1);
      }
    }
    return widths.stream().mapToInt(i -> i).toArray();
  }
}
