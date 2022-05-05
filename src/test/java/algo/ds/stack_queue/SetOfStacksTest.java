package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/stack_queue/SetOfStacks")
public class SetOfStacksTest {
  private SetOfStacks<Integer> stackSet;

  @BeforeEach
  public void setUp() {
    stackSet = new SetOfStacks<Integer>(3);
    stackSet.push(1);
    stackSet.push(2);
    stackSet.push(3);
    stackSet.push(4);
    stackSet.push(5);
    stackSet.push(6);
    stackSet.push(7);
  }

  @AfterEach
  public void clean() {
    stackSet = null;
  }

  @DisplayName("Test pop data from stack set.")
  @Test
  public void testStackSetPop() {
    assertEquals(stackSet.pop(), 7);
    assertEquals(stackSet.pop(), 6);
    assertEquals(stackSet.pop(), 5);
    assertEquals(stackSet.pop(), 4);
    assertEquals(stackSet.pop(), 3);
    assertEquals(stackSet.pop(), 2);
    assertEquals(stackSet.pop(), 1);
    assertEquals(stackSet.pop(), null);
  }

  @DisplayName("Test pop data from a particular stack.")
  @Test
  public void testStackSetPush() {
    assertEquals(stackSet.popAt(0), 3);
    assertEquals(stackSet.popAt(0), 2);
    assertEquals(stackSet.popAt(1), 6);
    assertEquals(stackSet.popAt(1), 5);
    assertEquals(stackSet.popAt(1), 4);
    assertEquals(stackSet.popAt(1), 7);  // The stack at index of 1 is empty and removed from stack set, so pop the first element in the next stack.
    assertEquals(stackSet.popAt(1), null);
  }
}
