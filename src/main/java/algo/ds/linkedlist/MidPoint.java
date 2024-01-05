package algo.ds.linkedlist;

/**
 * @name MidPoint
 * @description Find the middle node of a linked list
 *              If the list has an even number of elements, return the node at
 *              the end of the first half of the list.
 * @requirements Use MyLinkedList class. Do NOT use a counter variable. Do NOT
 *               retrive the size of the list.
 *               Only iterate through the list once.
 */
public class MidPoint {
  static public Node<Object> solution(MyLinkedList<Object> list) {
    var slow = list.findFirst();
    var fast = list.findFirst();
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
