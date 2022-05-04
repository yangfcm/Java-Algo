package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/stack_queue/GetMin")
public class GetMinTest {
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

  @DisplayName("Should find out the minimum number in a stack")
  @Test
  public void testSolution(){
    try {
      assertEquals(GetMin.solution(stack), -3);
    } catch(Exception e) {
      System.out.println(e.toString());
    }
    assertEquals(stack.peek(), 5);
  }
}
