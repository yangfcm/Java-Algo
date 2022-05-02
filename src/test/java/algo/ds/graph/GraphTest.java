package algo.ds.graph;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test ds/graph")
public class GraphTest {

  private Graph uGraph;
  private Graph dGraph;

  @BeforeEach
  public void setUp() {
    uGraph =  new Graph(new int[] {1,2,3,4,5});
    dGraph = new Graph(new int[] {1,2,3,4,5}, false);
  }

  @AfterEach
  public void clean() {
    uGraph = null;
    dGraph = null;
  }

  @DisplayName("Test graph can be initialized correctly.")
  @Test
  public void test() {
    assertArrayEquals(new int[]{1,2,3,4,5}, uGraph.getVertexList());
    assertEquals(uGraph.getUndirected(), true);
    assertEquals(uGraph.getNumberOfEdges(), 0);
    assertArrayEquals(uGraph.getIsVisited(), new boolean[5]);
    assertArrayEquals(uGraph.getMatrix(), new int[5][5]);
    assertArrayEquals(uGraph.getGraphArr().toArray(), new Integer[0]);

    assertArrayEquals(new int[]{1,2,3,4,5}, dGraph.getVertexList());
    assertEquals(dGraph.getUndirected(), false);
    assertEquals(dGraph.getNumberOfEdges(), 0);
    assertArrayEquals(dGraph.getIsVisited(), new boolean[5]);
    assertArrayEquals(dGraph.getMatrix(), new int[5][5]);
    assertArrayEquals(dGraph.getGraphArr().toArray(), new Integer[0]);
  }
}
