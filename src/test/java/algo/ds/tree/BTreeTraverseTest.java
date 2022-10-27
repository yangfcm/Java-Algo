package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/BTreeTraverse")
public class BTreeTraverseTest {
  Bst root1;
  Bst root2;

  @BeforeEach
  public void setUp() {
    // Set up two b-tree for testing.
    root1 = new Bst(1);
    root1.setLeft(2);
    root1.setRight(3);
    root1.getLeft().setLeft(4);
    root1.getLeft().setRight(5);
    root2 = new Bst(25);
    root2.add(15);
    root2.add(50);
    root2.add(10);
    root2.add(22);
    root2.add(35);
    root2.add(70);
    root2.add(4);
    root2.add(12);
    root2.add(18);
    root2.add(24);
    root2.add(31);
    root2.add(44);
    root2.add(66);
    root2.add(90);
  }

  @AfterEach
  public void clean() {
    root1 = null;
    root2 = null;
  }
  
  @DisplayName("Test preorder traverse of b-tree 1.")
  @Test
  void testPreOrderTree1() {
    var traverseList = BTreeTraverse.preOrder(root1);
    assertEquals(1, traverseList.get(0));
    assertEquals(2, traverseList.get(1));
    assertEquals(4, traverseList.get(2));
    assertEquals(5, traverseList.get(3));
    assertEquals(3, traverseList.get(4));
  }

  @DisplayName("Test preorder traverse of b-tree 2.")
  @Test
  void testPreOrderTree2() {
    var traverseList = BTreeTraverse.preOrder(root2);
    assertEquals(25, traverseList.get(0));
    assertEquals(15, traverseList.get(1));
    assertEquals(10, traverseList.get(2));
    assertEquals(4, traverseList.get(3));
    assertEquals(12, traverseList.get(4));
    assertEquals(22, traverseList.get(5));
    assertEquals(18, traverseList.get(6));
    assertEquals(24, traverseList.get(7));
    assertEquals(50, traverseList.get(8));
    assertEquals(35, traverseList.get(9));
    assertEquals(31, traverseList.get(10));
    assertEquals(44, traverseList.get(11));
    assertEquals(70, traverseList.get(12));
    assertEquals(66, traverseList.get(13));
    assertEquals(90, traverseList.get(14));
  }

  @DisplayName("Test inorder traverse of b-tree 1.")
  @Test
  void testInOrderTree1() {
    var traverseList = BTreeTraverse.inOrder(root1);
    assertEquals(4, traverseList.get(0));
    assertEquals(2, traverseList.get(1));
    assertEquals(5, traverseList.get(2));
    assertEquals(1, traverseList.get(3));
    assertEquals(3, traverseList.get(4));
  }

  @DisplayName("Test inorder traverse of b-tree 2.")
  @Test
  void testInOrderTree2() {
    var traverseList = BTreeTraverse.inOrder(root2);
    assertEquals(4, traverseList.get(0));
    assertEquals(10, traverseList.get(1));
    assertEquals(12, traverseList.get(2));
    assertEquals(15, traverseList.get(3));
    assertEquals(18, traverseList.get(4));
    assertEquals(22, traverseList.get(5));
    assertEquals(24, traverseList.get(6));
    assertEquals(25, traverseList.get(7));
    assertEquals(31, traverseList.get(8));
    assertEquals(35, traverseList.get(9));
    assertEquals(44, traverseList.get(10));
    assertEquals(50, traverseList.get(11));
    assertEquals(66, traverseList.get(12));
    assertEquals(70, traverseList.get(13));
    assertEquals(90, traverseList.get(14));
  }

  
  @DisplayName("Test postorder traverse of b-tree 1.")
  @Test
  void testPostOrderTree1() {
    var traverseList = BTreeTraverse.postOrder(root1);
    assertEquals(4, traverseList.get(0));
    assertEquals(5, traverseList.get(1));
    assertEquals(2, traverseList.get(2));
    assertEquals(3, traverseList.get(3));
    assertEquals(1, traverseList.get(4));
  }

  @DisplayName("Test postorder traverse of b-tree 2.")
  @Test
  void testPostOrderTree2() {
    var traverseList = BTreeTraverse.postOrder(root2);
    assertEquals(4, traverseList.get(0));
    assertEquals(12, traverseList.get(1));
    assertEquals(10, traverseList.get(2));
    assertEquals(18, traverseList.get(3));
    assertEquals(24, traverseList.get(4));
    assertEquals(22, traverseList.get(5));
    assertEquals(15, traverseList.get(6));
    assertEquals(31, traverseList.get(7));
    assertEquals(44, traverseList.get(8));
    assertEquals(35, traverseList.get(9));
    assertEquals(66, traverseList.get(10));
    assertEquals(90, traverseList.get(11));
    assertEquals(70, traverseList.get(12));
    assertEquals(50, traverseList.get(13));
    assertEquals(25, traverseList.get(14));
  }
}
