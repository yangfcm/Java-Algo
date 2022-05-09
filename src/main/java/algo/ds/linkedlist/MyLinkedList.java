package algo.ds.linkedlist;

/**
 * @name MyLinkedList
 * @descrption Implement linked list data structure. DO NOT use built-in LinkedList.
 * MyLinkedList should has these properties/methods: count, add(), addFirst(), addLast(),
 * find(), findFirst(), findLast(),
 * remove(), removeFirst(), removeLast(), clear().
 */
public class MyLinkedList<T> {
  private Node<T> head;
  private int count;

  public Node<T> getHead() {
    return head;
  }

  public MyLinkedList() {
    head = null;
  }

  public int getCount() {
    count = 0;
    var node = head;
    while(node != null) {
      count++;
      node = node.next;
    }
    return count;
  }

  public void addFirst(T data) {
    var node = new Node<T>(data);
    node.next = head;
    head = node;
  }

  public void addLast(T data) {
    var lastNode = findLast();
    var newNode = new Node<T>(data);
    if(lastNode == null) {
      head = newNode; // Empty list;
    } else {
      lastNode.next = newNode;
    }
  }

  public void addAt(T data, int index) {
    if(index < 0 || index > getCount()) throw new Error("Index is out of bound"); // Validate index parameter.
    if(index == 0) {  // Add node at the head.
      addFirst(data);
      return;
    }
    var prevNode = findAt(index-1);
    if(prevNode != null) {
      var newNode = new Node<T>(data);
      newNode.next = prevNode.next;
      prevNode.next = newNode;
    }
  }

  public Node<T> findFirst() {
    return head;
  }
  
  public Node<T> findLast() {
    var node = head;
    if(node == null) return null;
    while(node.next != null) {
      node = node.next;
    }
    return node;
  }

  public Node<T> findAt(int index) {
    int currentIndex = 0;
    var node = head;
    while(node != null) {
      if(currentIndex == index) {
        return node;
      }
      node = node.next;
      currentIndex++;
    }
    return null;
  }

}
