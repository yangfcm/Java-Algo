package algo.ds.linkedlist;

/**
 * @name SumLists
 * @description Given two number represented by a linked list, where each node contains a single digit.
 * 
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list
 * Write a function that adds the two numbers and returns the sum as a linked list
 * e.g. (7 -> 1 -> 6) + (5 -> 9 -> 2) => 617+295 = 912 => 2 -> 1 -> 9
 *
 * Then suppose the digits are stored in forward order. Repeat the above problem
 * e.g. (6 -> 1 -> 7) + (2 -> 9 -> 5) => 617+295 = 912 => 9 -> 1 -> 2
 * To implement it, either use linked list with double direction or reverse list and use the same implementation as below.
 * Do not convert to number.
 * @note Consider two lists are in different length.
 */
public class SumLists {
  static public MyLinkedList<Integer> solution(MyLinkedList<Integer> list1, MyLinkedList<Integer> list2) {
    var sumList = new MyLinkedList<Integer>();
    int count1 = list1.getCount();
    int count2 = list2.getCount();
    int maxCount = count1 > count2 ? count1 : count2; // Consider different count for two lists.
    var node1 = list1.getHead();
    var node2 = list2.getHead();

    for(int i = 0; i < maxCount; i++) { // Iterate through list1 and list2. How many times to iterate depends on the number/list with more digits/nodes.
      int digit1 = node1 == null ? 0 : node1.getData();
      int digit2 = node2 == null ? 0 : node2.getData();

      var lastNode = sumList.findLast();  // Save the current digit in the last position of sum list.
      int lastDigit = lastNode == null ? 0 : lastNode.getData();
      sumList.removeLast();
      int digitSum = digit1 + digit2 + lastDigit;
      
      sumList.addLast(digitSum % 10);
      sumList.addLast(digitSum / 10);
      
      // Move forward to the next node
      if(node1 != null) node1 = node1.next; 
      if(node2 != null) node2 = node2.next;
    }
    return sumList;
  }
}
