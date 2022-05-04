package algo.ds.stack_queue;

import java.util.Stack;

/**
 * @name GetMin
 * @description Given a stack of numbers, find out the minimum number in it.
 * @solution A straightforward thought is to "iterate" a stack as an array to find out the minimum number.
 * But don't forget, you can only read the first(top) number in a stack.
 * So when iterating, you need another stack to store the number iterated and when iteration is finished, put the numbers back to original stack.
 */
public class GetMin {
  public static int solution(Stack<Integer> stack) throws Exception {
    if(stack.size() == 0) {
      throw new Exception("Stack is empty.");
    }
    var tempStack = new Stack<Integer>();
    int min = stack.peek();
    while(stack.size() > 0) {
      var currentItem = stack.peek();
      if(currentItem < min) {
        min = currentItem;
      }
      tempStack.push(stack.pop());
    }
    while(tempStack.size() > 0) { // Restore the origina stack.
      stack.push(tempStack.pop());
    }
    return min;
  }
}
