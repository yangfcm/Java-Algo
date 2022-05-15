package algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Node
 * @description Node class for tree
 */
public class Tree<T> {
  private T data;
  private List<Tree<T>> children;

  public Tree(T data) {
    this.data = data;
    this.children = new ArrayList<Tree<T>>();
  }

  public void add(T data) {
    var newNode = new Tree<T>(data);
    this.children.add(newNode);
  }

  public void remove(T data) {
    for(int i = 0; i < this.children.size(); i++) {
      if(this.children.get(i).getData().equals(data)) {
        this.children.remove(i);
        return;
      }
    }
  }

  public T getData() {
    return data;
  }

  public List<Tree<T>> getChildren() {
    return children;
  }
}
