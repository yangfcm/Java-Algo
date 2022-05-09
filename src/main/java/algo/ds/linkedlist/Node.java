package algo.ds.linkedlist;

/**
 * @name Node
 * @description Node class for Linked list.
 */
public class Node<T> {
  private T data;
  public Node<T> next;

  public T getData() {
    return data;
  }

  public Node(T data) {
    this(data, null);
  }

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }
}
