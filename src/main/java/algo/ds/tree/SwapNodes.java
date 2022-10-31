package algo.ds.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @name SwapNodes
 * @description For detailed description and examples, refere to the link below.
 * @source https://www.hackerrank.com/challenges/swap-nodes-algo/problem
 */
public class SwapNodes {

  /**
   * @name buildTree
   * @description Given a 2D array (indexes), return a tree root node that is represented by the array.
   * Its root node is always 1 and its leaf nodes are natural numbers: 2, 3, 4, 5 ... -1 means no node for this position.
   * @example indexes = [
      [2, 3],
      [4, -1],
      [5, -1],
      [6, -1],
      [7, 8],
      [-1, 9],
      [-1, -1],
      [10, 11],
      [-1, -1],
      [-1, -1],
      [-1, -1],
    ]
    Its corresponding tree should look like:
            1
           / \
          2   3
         /   /
        4    5
       /    /\
      6    7  8
       \      /\
        9    10 11 
   * @param indexes
   * @return Root node of B-tree
   */
  private static Bst buildTree(int[][] indexes) {
    var nodeIndexes = new ArrayList<Bst[]>();
    var nodesMap = new HashMap<Integer, Bst>();
    nodesMap.put(1, new Bst(1));

    for(int[] idx: indexes) {
      Bst left = null;
      Bst right = null;
      if(idx[0] != -1) {
        left = new Bst(idx[0]);
        nodesMap.put(idx[0], left);
      }

      if(idx[1] != -1) {
        right = new Bst(idx[1]);
        nodesMap.put(idx[1], right);
      }
      nodeIndexes.add(new Bst[]{left, right});
    }

    for(int i = 0; i < nodeIndexes.size(); i++) {
      var node = nodesMap.get(i+1);
      node.setLeft(nodeIndexes.get(i)[0]);
      node.setRight(nodeIndexes.get(i)[1]);
      nodesMap.put(i + 1, node);
    }

    return nodesMap.get(1);
  }

  /**
   * @param indexes
   * @param queries
   * @return An array of inorder traversal of the tree after each swap.
   * @solution It actually involves a number of child problems.
   * 1. Need to create a b-tree from indexes (buildTree)
   * 2. Create an array for each level of the tree (ListOfDepths)
   * 3. Inorder traverse a tree (BTreeTraverse.inOrder)
   * With the above three problems solved, the swap operation itself is easy.
   * Just iterate nodes throughout a level and swap each node's left child and right child.
   */
  public static List<int[]> solution(int[][] indexes, int[] queries) {
    var traversalResult = new ArrayList<int[]>();
    Bst tree = buildTree(indexes);
    List<List<Bst>> levelsList = ListOfDepths.solution2(tree);
    int depths = levelsList.size();
    for(int q: queries) {
      int k = 1;
      int level = k*q;
      while(level <= depths) {
        List<Bst> levelNodes = levelsList.get(level-1);
        for(int i = 0; i < levelNodes.size(); i++) {
          Bst node = levelNodes.get(i);
          var temp = node.getLeft();
          node.setLeft(node.getRight());
          node.setRight(temp);
        }
        k++;
        level = k*q;
      }
      var traversalAfterSwap = BTreeTraverse.inOrder(tree);
      traversalResult.add(traversalAfterSwap);
    }

    return traversalResult;
  }
}
