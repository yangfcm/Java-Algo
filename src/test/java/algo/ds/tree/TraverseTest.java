package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/traverse")
public class TraverseTest {
  Tree<Character> node;
  // Tree<Character> tree;

  // @BeforeEach
  // public void setUp() {
  //   node = new TreeNode<Character>('a');
  //   tree = new Tree<Character>();
  //   tree.setRoot(new TreeNode<Character>('a'));
  //   tree.getRoot().add('b');
  //   tree.getRoot().add('c');
  //   tree.getRoot().add('d');
  //   tree.getRoot().getChildren().get(0).add('e');
  //   tree.getRoot().getChildren().get(0).add('f');
  //   tree.getRoot().getChildren().get(2).add('g');
  // }

  // @AfterEach
  // public void clean() {
  //   node = null;
  //   tree = null;
  // }
  
  @DisplayName("Test node initialization.")
  @Test
  public void testInitialNode() {
    // assertEquals('a', node.getData());
    // assertEquals(0, node.getChildren().size());
  }

}
