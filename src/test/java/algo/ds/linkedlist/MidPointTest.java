package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/MidPoint")
public class MidPointTest {
  private MyLinkedList<Integer> list;

  @BeforeEach
  public void setUp() {
    list = new MyLinkedList<Integer>();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
  }

  @AfterEach
  public void clean() {
    list = null;
  }

  @DisplayName("Should return the middle node of an odd number of list.")
  @Test
  public void testMidPointWithOddNumberOfList() {
    var midPoint = MidPoint.solution(list);
    assertEquals(3, midPoint.getData());
  }

  @DisplayName("Should return the middle node(the last one of the first half) of an even number of list.")
  @Test
  public void testMidPointWithEvenNumberOfList() {
    list.addLast(6);  // Add a new node to make the number of nodes as an even number.
    var midPoint = MidPoint.solution(list);
    assertEquals(3, midPoint.getData());
  }
}
