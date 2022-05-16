package algo.ds.tree;

/**
 * @name Bst(Binary Serch Tree)
 * @description 1. Implement the Bst class to create a binary search tree.
 * The constructor should initialize values 'data', 'left' and 'right'
 * For BST: A node's *left* children's values are all less than the node itself, 
 * while its *right* children's values are bigger. 
 * 2. Implement the 'Add' method for the Node class.
 * Add should accept an argument 'data', 
 * then create a new node and add it at the appropriate location in the tree.
 * 3. Implement the 'Find' method for the Node class.
 * 'Find' should accept a 'data' argument and return the Node in the tree with the same value
 * If the value isn't in the tree, return null.
 * 4. Implement the 'IsBst' method for the Node class to examine if the tree is a *Binary Search Search*
 * If it is, return true; otherwise return false.
 */
public class Bst {
  private int data;
  private Bst left;
  private Bst right;
  
  public Bst(int data) {
    this.data = data;
    left = null;
    right = null;
  }

  public int getData() {
    return data;
  }
  public Bst getLeft() {
    return left;
  }
  public Bst getRight() {
    return right;
  }
}
