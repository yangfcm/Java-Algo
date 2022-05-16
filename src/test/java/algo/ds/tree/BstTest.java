package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/Bst")
public class BstTest {
  Bst node;

  @BeforeEach
  public void setUp() {
    node = new Bst(10);
    node.add(5);
    node.add(15);
    node.add(20);
    node.add(0);
    node.add(-5);
    node.add(3);
  }

  @AfterEach
  public void clean() {
    node = null;
  }

  @DisplayName("Should be able to add a node to BST")
  @Test
  public void testAdd() {
    var node = new Bst(3);
    node.add(2);
    node.add(4);
    node.add(5);
    assertEquals(3, node.getData());
    assertEquals(2, node.getLeft().getData());
    assertEquals(4, node.getRight().getData());
    assertEquals(5, node.getRight().getRight().getData());
  }

  @DisplayName("Should be able to find the node given the number or return null if the given number doesn't exist in the tree")
  @Test
  public void testFind() {
    assertEquals(10, node.find(10).getData());
    assertEquals(0, node.find(0).getData());
    assertEquals(-5, node.find(-5).getData());
    assertEquals(20, node.find(20).getData());
    assertEquals(null, node.find(1));
  }

  @DisplayName("Should be able to test if a given tree is BST")
  @Test
  public void testIsBst() {
    assertTrue(Bst.isBst(node));

    var nonBstNode = new Bst(3);
    nonBstNode.setLeft(5);
    nonBstNode.setRight(1);
    assertFalse(Bst.isBst(nonBstNode));
  }
}
