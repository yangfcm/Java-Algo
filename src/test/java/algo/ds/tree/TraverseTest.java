package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/tree/traverse")
public class TraverseTest {
  Tree<Object> tree;

  @BeforeEach
  public void setUp() {
    tree = new Tree<Object>('a');
    tree.add('b');
    tree.add('c');
    tree.add('d');
    tree.getChildren().get(0).add('e');
    tree.getChildren().get(0).add('f');
    tree.getChildren().get(2).add('g');
  }

  @AfterEach
  public void clean() {
    tree = null;
  }
  
  @DisplayName("Should be able to do BFS traverse")
  @Test
  public void testBfs() {
    var traverseList = Traverse.bfs(tree);
    assertEquals('a', traverseList.get(0));
    assertEquals('b', traverseList.get(1));
    assertEquals('c', traverseList.get(2));
    assertEquals('d', traverseList.get(3));
    assertEquals('e', traverseList.get(4));
    assertEquals('f', traverseList.get(5));
    assertEquals('g', traverseList.get(6));
  }

  @DisplayName("Should be able to do DFS traverse")
  @Test
  public void testDfs() {
    var traverseList = Traverse.dfs(tree);
    assertEquals('a', traverseList.get(0));
    assertEquals('b', traverseList.get(1));
    assertEquals('e', traverseList.get(2));
    assertEquals('f', traverseList.get(3));
    assertEquals('c', traverseList.get(4));
    assertEquals('d', traverseList.get(5));
    assertEquals('g', traverseList.get(6));
  }
}
