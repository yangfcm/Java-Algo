package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/Circular")
public class CircularTest {
  private MyLinkedList<Integer> list;

  @BeforeEach
  public void setUp() { // Create a standard linked list.
    list = new MyLinkedList<Integer>();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
  }

  @AfterEach
  public void clean() {
    list = null;
  }

  @Test
  public void testCircularAsTrue() {
    var lastNode = list.findLast();
    var firstNode = list.findFirst();
    lastNode.next = firstNode;  // Make linked list circular
    assertTrue(Circular.solution(list));
  }

  @Test
  public void testCircularAsFalse() {
    assertFalse(Circular.solution(list));
  }
}
