package algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Node
 * @description Node class for tree
 */
public class TreeNode<T> {
  private T data;
  private List<TreeNode<T>> children;

  public TreeNode(T data) {
    this.data = data;
    this.children = new ArrayList<TreeNode<T>>();
  }

  public void add(T data) {
    var newNode = new TreeNode<T>(data);
    this.children.add(newNode);
  }

  public void remove(T data) {
    this.children.remove(data);
  }

  public T getData() {
    return data;
  }

  public List<TreeNode<T>> getChildren() {
    return children;
  }
}
