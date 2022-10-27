package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
    assertArrayEquals(new int[]{1, 2, 4, 5, 3}, BTreeTraverse.preOrder(root1));
  }

  @DisplayName("Test preorder traverse of b-tree 2.")
  @Test
  void testPreOrderTree2() {
    assertArrayEquals(
      new int[]{25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90}, 
      BTreeTraverse.preOrder(root2)
    );
  }

  @DisplayName("Test inorder traverse of b-tree 1.")
  @Test
  void testInOrderTree1() {
    assertArrayEquals(new int[] {4, 2, 5, 1, 3}, BTreeTraverse.inOrder(root1));
  }

  @DisplayName("Test inorder traverse of b-tree 2.")
  @Test
  void testInOrderTree2() {
    assertArrayEquals(
      new int[] {4,10,12,15,18,22,24,25,31,35,44,50,66,70,90},
      BTreeTraverse.inOrder(root2)
    );
  }

  
  @DisplayName("Test postorder traverse of b-tree 1.")
  @Test
  void testPostOrderTree1() {
    assertArrayEquals(new int[]{4, 5, 2, 3, 1}, BTreeTraverse.postOrder(root1));
  }

  @DisplayName("Test postorder traverse of b-tree 2.")
  @Test
  void testPostOrderTree2() {
    assertArrayEquals(
      new int[]{4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25},
      BTreeTraverse.postOrder(root2)
    );
  }
}
