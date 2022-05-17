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
  private Integer data;
  private Bst left;
  private Bst right;
  
  public Bst(Integer data) {
    this.data = data;
    left = null;
    right = null;
  }

  public void add(Integer data) {
    if(data < this.data) {
      if(left == null) {
        left = new Bst(data);
      } else {
        left.add(data);
      }
    } else if(data > this.data) {
      if(right == null) {
        right = new Bst(data);
      } else {
        right.add(data);
      }
    } else {
      throw new Error("Parameter data is available in the tree.");
    }   
  }

  public Bst find(Integer data) {
    if(this.data == data) return this;
    if(data < this.data && left != null) {
      return left.find(data);
    } else if(data > this.data && right != null) {
      return right.find(data);
    }
    return null;
  }

  public Integer getData() {
    return data;
  }
  public Bst getLeft() {
    return left;
  }
  public Bst getRight() {
    return right;
  }

  // setLeft and setRight makes it possible to add any random data to the binary tree,
  // which cannot guarantee it is to be *balanced*.
  public void setLeft(int data) {
    this.left = new Bst(data);
  }
  public void setLeft(Bst node) {
    this.left = node;
  }
  public void setRight(int data) {
    this.right = new Bst(data);
  }
  public void setRight(Bst node) {
    this.right = node;
  }

  public static boolean isBst(Bst node) {
    return isBst(node, null, null);
  }

  private static boolean isBst(Bst node, Integer min, Integer max) {
    if(max != null && node.getData() > max) return false;
    if(min != null && node.getData() < min) return false;
    if(node.getLeft() != null && isBst(node.getLeft(), min, node.getData()) == false) return false;
    if(node.getRight() != null && isBst(node.getRight(), node.getData(), max) == false) return false;
    return true;
  }
}
