package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/MinimalBst")
public class MinimalBstTest {

  @Test
  public void testMinimalBstCase1() {
    Bst node = MinimalBst.solution(new int[]{1});
    assertEquals(1, node.getData());
    assertEquals(null, node.getLeft());
    assertEquals(null, node.getRight());
  }

  @Test
  public void testMinimalBstCase2() {
    Bst node = MinimalBst.solution(new int[]{1, 2});
    assertEquals(1, node.getData());
    assertEquals(null, node.getLeft());
    assertEquals(2, node.getRight().getData());
  }

  @Test
  public void testMinimalBstCase3() {
    Bst node = MinimalBst.solution(new int[]{1,2,3,4,5,6});
    assertEquals(3, node.getData());
    assertEquals(1, node.getLeft().getData());
    assertEquals(5, node.getRight().getData());

    assertEquals(null, node.getLeft().getLeft());
    assertEquals(2, node.getLeft().getRight().getData());
    assertEquals(4, node.getRight().getLeft().getData());
    assertEquals(6, node.getRight().getRight().getData());
  }
}
