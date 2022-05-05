package algo.ds.stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @name SetOfStacks
 * @description Imagine a (literal) stack of plates. If the stack goes too high, it might topple.
 * Therefore, in real life, we would start a new stack when the previous stack exceeds a threshold.
 * Implement a data structure SetOfStacks to mimic this.
 * SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack
 * Also implement a function popAt(index) to perform pop operation on a specific sub-stack.
 * Think about the sub-stack is not at full capacity when pop an element from it.
 */
public class SetOfStacks<T> {
  private int capacity;
  private List<Stack<T>> stacks;
  public SetOfStacks(int capacity) {
    this.capacity = capacity;
    stacks = new ArrayList<Stack<T>>();
  }

  public void push(T data) {
    if(stacks.size() == 0) {
      stacks.add(new Stack<T>());
    }
    var lastStack = stacks.get(stacks.size() - 1);  // Get the last stack
    if(lastStack.size() >= capacity) {  //
      var newStack = new Stack<T>();
      newStack.push(data);
      stacks.add(newStack);
    } else {
      lastStack.push(data);
    }
  }

  public T pop() {
    if(stacks.size() == 0) {
      return null;
    }
    Stack<T> lastStack = stacks.get(stacks.size() - 1);
    T popedEl = lastStack.pop();
    if(lastStack.size() == 0) { // If last stack is empty, remove this stack from stacks list.
      stacks.remove(stacks.size() - 1);
    }
    return popedEl;
  }

  public T popAt(int index) {
    if(index >= stacks.size()) return null;
    Stack<T> subStack = stacks.get(index);
    T popedEl = subStack.pop();
    if(subStack.size() == 0) {
      stacks.remove(index);
    }
    return popedEl;
  }
}
