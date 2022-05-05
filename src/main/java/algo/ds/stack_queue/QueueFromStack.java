package algo.ds.stack_queue;

import java.util.Stack;

/**
 * @name QueueFromStack
 * @description Implement a Queue data structure using two stacks.
 * Should implement methods enqueue, dequeue, peek.
 */
public class QueueFromStack<T> {
  private Stack<T> stack1;
  private Stack<T> stack2;
  public QueueFromStack() {
    stack1 = new Stack<T>();
    stack2 = new Stack<T>();
  }

  public void enqueue(T el) {
    stack1.push(el);
  }

  public T dequeue() {
    while(stack1.size() > 0) {
      // Move all the elements from stack1 to stack2.
      stack2.push(stack1.pop());
    }
    // Now the top element in stack2 is exactly the first element we want in the queue.
    var elToDequeue = stack2.pop();
    while(stack2.size() > 0) {
      // If there are elements left in stack2, move it back to stack1 for next operation.
      stack1.push(stack2.pop());
    }
    return elToDequeue;
  }

  public T peek() {
    while(stack1.size() > 0) {
      // Move all the elements from stack1 to stack2.
      stack2.push(stack1.pop());
    }
    // Now the top element in stack2 is exactly the first element we want in the queue.
    var elToPeek = stack2.peek();
    while(stack2.size() > 0) {
      // If there are elements left in stack2, move it back to stack1 for next operation.
      stack1.push(stack2.pop());
    }
    // Anyway, the logic is very similar to dequeue().
    return elToPeek;
  }
}
