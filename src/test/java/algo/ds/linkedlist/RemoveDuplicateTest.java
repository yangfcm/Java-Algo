package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/RemoveDuplicate")
public class RemoveDuplicateTest {
  private MyLinkedList<Integer> list;
  
  @BeforeEach
  public void setUp() {
    list = new MyLinkedList<Integer>();
    list.addLast(1);
    list.addLast(2);
    list.addLast(2);
    list.addLast(3);
    list.addLast(2);
    list.addLast(3);
    list.addLast(3);
    list.addLast(1);
  }

  @AfterEach
  public void clean() {
    list = null;
  }

  @Test
  public void testRemoveDuplicate() {
    RemoveDuplicate.solution(list);
    assertEquals(3, list.getCount());
    assertEquals(list.findAt(0).getData(), 1);
    assertEquals(list.findAt(1).getData(), 2);
    assertEquals(list.findAt(2).getData(), 3);
  }
}
