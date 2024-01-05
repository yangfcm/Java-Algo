package algo.ds.linkedlist;

/**
 * @name Circular
 * @description A circular linked list is a linked list where every element's
 *              next property points to the next element.
 *              i.e. the "last" node's next points to the "first" node.
 *              An example:
 *              const l = new List();
 *              const a = new Node('a');
 *              const b = new Node('b');
 *              const c = new Node('c');
 *              l.head = a;
 *              a.next = b;
 *              b.next = c;
 *              c.next = b;
 *              circular(l) // true
 *              Implement the solution to check if a linked list is circular.
 *              Use MyLinkedList.
 */
public class Circular {
  static public boolean solution(MyLinkedList<Object> list) {
    var slow = list.getHead();
    var fast = list.getHead();
    // Set two temporary variables, slow and fast
    // While iterating the list, slow advances with one step,
    // fast advaces with two steps.
    // If slow === fast, it means they meet at some point of the list
    // so it is a circular list and returns true, otherwise return false.

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}
