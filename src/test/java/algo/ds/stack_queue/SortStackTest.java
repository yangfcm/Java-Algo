package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/stack_queue/SortStack")
public class SortStackTest {
  private Stack<Integer> stack;

  @BeforeEach
  public void setUp() {
    stack = new Stack<Integer>();
    stack.push(3);
    stack.push(9);
    stack.push(7);
    stack.push(-3);
    stack.push(0);
    stack.push(5);
  }

  @AfterEach
  public void clean() {
    stack = null;
  }

  @DisplayName("Should sort the stack")
  @Test
  public void testSolution(){
    SortStack.solution(stack);
    assertEquals(-3, stack.pop());
    assertEquals(0, stack.pop());
    assertEquals(3, stack.pop());
    assertEquals(5, stack.pop());
    assertEquals(7, stack.pop());
    assertEquals(9, stack.pop());
  }
}
