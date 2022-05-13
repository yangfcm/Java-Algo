package algo.ds.linkedlist;

/**
 * @name Partition
 * @description Given a linked list and an integer n, partition the linked list around n such that
 * all nodes less than n comes before all nodes greater than or equal to x.
 * The partition element n can appear anywhere in the right partition.
 * e.g. 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1, n = 5
 * After parition: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class Partition {
  static public MyLinkedList<Integer> solution(MyLinkedList<Integer> list, int n) {
    var partitionList = new MyLinkedList<Integer>();
    var node = list.getHead();
    while(node != null) { // iterate through the list.
      if(node.getData() < n) {
        partitionList.addFirst(node.getData());
      } else {
        partitionList.addLast(node.getData());
      }
      node = node.next;
    }
    return partitionList;
  }
}
class Parition {
  
}
