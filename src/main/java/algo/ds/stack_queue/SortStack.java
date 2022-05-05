package algo.ds.stack_queue;

import java.util.Stack;

/**
 * @name SortStack
 * @description Sort a given stack in place such that the smallest number is on the top.
 */
public class SortStack {
  static public void solution(Stack<Integer> stack) {
    Stack<Integer> sortedStack = new Stack<Integer>();  // Create a temp stack where the bigger number is on top.
    while(stack.size() > 0) {
      int currentEl = stack.pop();
      if(sortedStack.size() == 0) {
        sortedStack.push(currentEl);
      } else {
        while(sortedStack.size() > 0 && sortedStack.peek() > currentEl) {
          stack.push(sortedStack.pop());  // Make sure the bigger number in sortedStack is on the top.
        }
        sortedStack.push(currentEl);
      }
    }
    while(sortedStack.size() > 0) { // Move the elements in sortedStack to stack.
      // Since the elements in sortedStack is already sorted from big(top) to small(bottom), the stack will have the elements sorted from small(top) to big(bottom).
      stack.push(sortedStack.pop());
    }
  }
}
