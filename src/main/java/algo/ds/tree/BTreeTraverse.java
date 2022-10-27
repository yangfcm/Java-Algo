package algo.ds.tree;

import java.util.List;
import java.util.ArrayList;

/**
 * @name BTreeTraverse
 * @description Implement three ways to traverse a binary tree: inorder, preorder, postorder
 * @source https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */
public class BTreeTraverse {
  private static List<Integer> traverseList = new ArrayList<Integer>();

  public static int[] preOrder(Bst node) {
    traverseList = new ArrayList<Integer>();
    doPreOrderTraverse(node);
    return traverseList.stream().mapToInt(i -> i).toArray();
  }

  private static void doPreOrderTraverse(Bst node) {
    if(node == null) return;
    traverseList.add(node.getData());
    doPreOrderTraverse(node.getLeft());
    doPreOrderTraverse(node.getRight());
  }

  public static int[] inOrder(Bst node) {
    traverseList = new ArrayList<Integer>();
    doInOrderTraverse(node);
    return traverseList.stream().mapToInt(i -> i).toArray();
  }

  private static void doInOrderTraverse(Bst node) {
    if(node == null) return;
    doInOrderTraverse(node.getLeft());
    traverseList.add(node.getData());
    doInOrderTraverse(node.getRight());
  }

  public static int[] postOrder(Bst node) {
    traverseList = new ArrayList<Integer>();
    doPostOrderTraverse(node);
    return traverseList.stream().mapToInt(i -> i).toArray();
  }

  private static void doPostOrderTraverse(Bst node) {
    if(node == null) return;
    doPostOrderTraverse(node.getLeft());
    doPostOrderTraverse(node.getRight());
    traverseList.add(node.getData());
  }
}