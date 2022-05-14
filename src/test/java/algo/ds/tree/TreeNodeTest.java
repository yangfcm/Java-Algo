package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/TreeNode")
public class TreeNodeTest {
  TreeNode<Character> node;

  @BeforeEach
  public void setUp() {
    node = new TreeNode<Character>('a');
  }

  @AfterEach
  public void clean() {
    node = null;
  }
  
  @DisplayName("Test node initialization.")
  @Test
  public void testInitialNode() {
    assertEquals('a', node.getData());
    assertEquals(0, node.getChildren().size()); // The node doesn't have children.
  }

  @DisplayName("Should be able to add node")
  @Test
  public void testAddingNode() {
    node.add('b');
    assertEquals(1, node.getChildren().size());
    assertEquals('b', node.getChildren().get(0).getData());
  }

  @DisplayName("Should be able to remove node")
  @Test
  public void testRemovingNode() {
    node.add('b');
    node.add('c');
    node.add('d');
    node.remove('c');
    assertEquals(2, node.getChildren().size());
    assertEquals('b', node.getChildren().get(0).getData());
    assertEquals('d', node.getChildren().get(1).getData());
  }
}
