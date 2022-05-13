package algo.ds.linkedlist;

import java.util.ArrayList;

/**
 * @name RemoveDuplicate
 * @description Given a linked list, remove the duplicate nodes from it.
 */
public class RemoveDuplicate {
  static public void solution(MyLinkedList<Integer> list) {
    if(list.getHead() == null) return;
    var head = list.getHead();
    var node = head.next;
    var existingData = new ArrayList<Integer>();  // Use a list to store the data iterated.
    existingData.add(head.getData());
    while(node != null) {
      if(existingData.contains(node.getData())) {
        // If the current data appeared in exisintData.
        head.next = node.next == null ? null : node.next;
      } else {
        existingData.add(node.getData());
        head = head.next;
      }
      node = node.next;
    }
  }
}
