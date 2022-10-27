package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/LevelWidth")
public class LevelWidthTest {
  Tree<Integer> tree1;
  Tree<Integer> tree2;

  @BeforeEach
  public void setUp() {
    tree1 = new Tree<Integer>(1);
    tree1.add(1);
    tree1.add(2);
    tree1.add(3);
    tree1.getChildren().get(0).add(4);
    tree1.getChildren().get(2).add(5);

    tree2 = new Tree<Integer>(1);
    tree2.add(2);
    tree2.getChildren().get(0).add(3);
    tree2.getChildren().get(0).add(4);
    tree2.getChildren().get(0).getChildren().get(0).add(5);
  }

  @AfterEach
  public void clean() {
    tree1 = null;
    tree2 = null;
  }

  @DisplayName("Should return correct level width array")
  @Test
  public void testSolution() {
    assertArrayEquals(new int[] { 1, 3, 2 }, LevelWidth.solution(tree1));
    assertArrayEquals(new int[] { 1, 1, 2, 1 }, LevelWidth.solution(tree2));
  }
}
