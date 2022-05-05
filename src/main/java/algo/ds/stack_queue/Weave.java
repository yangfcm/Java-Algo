package algo.ds.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @name Weave
 * @description Receive two queues as arguments and combines the contents of each into a new, third queue.
 * The new queue should contain the alterating of the two queues.
 * The function should handle queues of different lengths without inserting 'undefined' into the new one
 * @excample queue1 = {1, 2, 3}, queue2 = {5, 6, 7, 8, 9}, after weaving => queue3 = {1, 5, 2, 6, 3, 7, 8, 9}
 */
public class Weave {
  static public Queue<Integer> solution(Queue<Integer> queue1, Queue<Integer> queue2) {
    var weavedQueue = new LinkedList<Integer>();
    while(queue1.size() > 0 || queue2.size() > 0) {
      if(queue1.size() > 0) {
        weavedQueue.add(queue1.poll());
      }
      if(queue2.size() > 0) {
        weavedQueue.add(queue2.poll());
      }
    }
    return weavedQueue;
  }
}
