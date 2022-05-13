package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/SumLists")
public class SumListsTest {
  private MyLinkedList<Integer> list1;
  private MyLinkedList<Integer> list2;

  @BeforeEach
  public void setUp() {
    list1 = new MyLinkedList<Integer>();
    list2 = new MyLinkedList<Integer>();
  }

  @AfterEach
  public void clean() {
    list1 = null;
    list2 = null;
  }

  @DisplayName("Should sum two lists correctly - case 1")
  @Test
  public void testSumLists1() {
    list1.addLast(7);
    list1.addLast(1);
    list1.addLast(6);
    list2.addLast(5);
    list2.addLast(9);
    list2.addLast(2);
    var sumList = SumLists.solution(list1, list2);
    assertEquals(2, sumList.findAt(0).getData());
    assertEquals(1, sumList.findAt(1).getData());
    assertEquals(9, sumList.findAt(2).getData());
  }

  @DisplayName("Should sum two lists correctly - case 2")
  @Test
  public void testSumLists2() {
    list1.addLast(9);
    list1.addLast(9);
    list1.addLast(9);
    list1.addLast(9);
    list2.addLast(1);
    var sumList = SumLists.solution(list1, list2);
    assertEquals(0, sumList.findAt(0).getData());
    assertEquals(0, sumList.findAt(1).getData());
    assertEquals(0, sumList.findAt(2).getData());
    assertEquals(0, sumList.findAt(3).getData());
    assertEquals(1, sumList.findAt(4).getData());
  }

  @DisplayName("Should sum two lists correctly - case 3")
  @Test
  public void testSumLists3() {
    list1.addLast(9);
    list1.addLast(9);
    list1.addLast(9);
    list2.addLast(9);
    list2.addLast(8);
    var sumList = SumLists.solution(list1, list2);
    assertEquals(8, sumList.findAt(0).getData());
    assertEquals(8, sumList.findAt(1).getData());
    assertEquals(0, sumList.findAt(2).getData());
    assertEquals(1, sumList.findAt(3).getData());
  }
}
