package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/ListOfDepths")
public class ListOfDepthsTest {
  private Bst node;
  
  @BeforeEach
  public void setUp() {
    node = new Bst(5);
    node.add(3);
    node.add(7);
    node.add(2);
    node.add(4);
    node.add(6);
    node.add(1);
  }

  @AfterEach
  public void clean() {
    node = null;
  }

  @DisplayName("Should be able to create lists")
  @Test
  public void testSolution() {
    var lists = ListOfDepths.solution(node);
    assertEquals(5, lists.get(0).get(0).getData());
    assertEquals(3, lists.get(1).get(0).getData());
    assertEquals(7, lists.get(1).get(1).getData());
    assertEquals(2, lists.get(2).get(0).getData());
    assertEquals(4, lists.get(2).get(1).getData());
    assertEquals(6, lists.get(2).get(2).getData());
    assertEquals(1, lists.get(3).get(0).getData());
  }
}
