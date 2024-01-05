package algo.ds.linkedlist;

/**
 * @name SearchFromLast
 * @description Given a linked list and a number n, return the element n spaces
 *              from the last node in the list.
 */
public class SearchFromLast {
  static public Node<Object> solution(MyLinkedList<Object> list, int n) {
    var slow = list.getHead();
    var fast = list.getHead();
    for (int i = 0; i < n; i++) {
      // Move fast advance by n steps.
      fast = fast.next;
    }
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }
}
