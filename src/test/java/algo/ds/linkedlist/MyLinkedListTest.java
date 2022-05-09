package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/MyLinkedList")
public class MyLinkedListTest {
  private MyLinkedList<String> list;

  @BeforeEach
  public void setUp() {
    list = new MyLinkedList<String>();
  }

  @AfterEach
  public void clean() {
    list = null;
  }

  private void populateList() {
    list.addLast("a");
    list.addLast("b");
    list.addLast("c");
    list.addLast("d");
  }

  @DisplayName("Should create an empty linked list")
  @Test
  public void testConstructor() {
    assertEquals(0, list.getCount());
    assertEquals(null, list.getHead());
  }

  @DisplayName("Should be able to find out nodes")
  @Test
  public void testFindMethods() {
    populateList();
    assertEquals("a", list.findFirst().getData());
    assertEquals("d", list.findLast().getData());
    assertEquals("a", list.findAt(0).getData());
    assertEquals("b", list.findAt(1).getData());
    assertEquals("c", list.findAt(2).getData());
    assertEquals("d", list.findAt(3).getData());
    assertEquals(null, list.findAt(4));
  }

  @DisplayName("Should be able to add nodes to linked list at the first position and the last position.")
  @Test
  public void testAddFirstAndLast() {
    populateList();
    assertEquals(4, list.getCount());
    
    list.addFirst("first");
    assertEquals(5, list.getCount());
    assertEquals("first", list.findFirst().getData());
    
    list.addLast("last");
    assertEquals(6, list.getCount());
    assertEquals("last", list.findLast().getData());
  }

  @DisplayName("Should be able to add nodes to linked list at a particular position")
  @Test
  public void testAddAt() {
    populateList();
    assertEquals(4, list.getCount());

    list.addAt("first", 0);
    assertEquals(5, list.getCount());
    assertEquals("first", list.findFirst().getData());

    list.addAt("middle", 3);
    assertEquals(6, list.getCount());
    assertEquals("middle", list.findAt(3).getData());
  }

  @DisplayName("Should be able to remove the first and last nodes from linked list")
  @Test
  public void testRemoveFirstAndLast() {
    populateList();
    assertEquals(4, list.getCount());

    list.removeFirst();
    assertEquals(3, list.getCount());
    assertEquals("b", list.findFirst().getData());  // After the first node is removed, its originally second node becomes the first.

    list.removeLast();
    assertEquals(2, list.getCount());
    assertEquals("c", list.findLast().getData()); // After the last node is removed, its originally second last node becomes the last.
  }

  @DisplayName("Should be able to remove nodes at a particular position from linked list")
  @Test
  public void testRemoveAt() {
    populateList();
    assertEquals(4, list.getCount());

    list.removeAt(2);
    assertEquals(3, list.getCount());
    assertEquals("d", list.findAt(2).getData());
  }
}
