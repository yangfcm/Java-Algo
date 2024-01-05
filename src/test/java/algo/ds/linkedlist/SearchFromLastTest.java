package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/SearchFromLast")
public class SearchFromLastTest {
  private MyLinkedList<Object> list;

  @BeforeEach
  public void setUp() {
    list = new MyLinkedList<Object>();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.addLast(6);
  }

  @AfterEach
  public void clean() {
    list = null;
  }

  @DisplayName("Should be able to find out element from the last")
  @Test
  public void testSearchFromLast() {
    assertEquals(6, SearchFromLast.solution(list, 0).getData());
    assertEquals(5, SearchFromLast.solution(list, 1).getData());
    assertEquals(4, SearchFromLast.solution(list, 2).getData());
    assertEquals(3, SearchFromLast.solution(list, 3).getData());
    assertEquals(2, SearchFromLast.solution(list, 4).getData());
    assertEquals(1, SearchFromLast.solution(list, 5).getData());
  }
}
