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
    uGraph.insertEdge(0, 1);
    uGraph.insertEdge(1, 3);
    uGraph.insertEdge(2, 3);
    uGraph.insertEdge(2, 4);
    uGraph.insertEdge(0, 4);
    dGraph = new Graph(new int[] {1,2,3,4,5}, false);
    dGraph.insertEdge(0, 1);
    dGraph.insertEdge(1, 3);
    dGraph.insertEdge(2, 3);
    dGraph.insertEdge(2, 4);
    dGraph.insertEdge(0, 4);
    dGraph.insertEdge(4, 0);
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
    assertEquals(uGraph.getNumberOfEdges(), 5);
    assertArrayEquals(uGraph.getIsVisited(), new boolean[5]);
    int[][] expectedUGraph = {
      {0,1,0,0,1},
      {1,0,0,1,0},
      {0,0,0,1,1},
      {0,1,1,0,0},
      {1,0,1,0,0},
    };
    assertArrayEquals(uGraph.getMatrix(), expectedUGraph);
    assertArrayEquals(uGraph.getGraphArr().toArray(), new Integer[0]);

    assertArrayEquals(new int[]{1,2,3,4,5}, dGraph.getVertexList());
    assertEquals(dGraph.getUndirected(), false);
    assertEquals(dGraph.getNumberOfEdges(), 6);
    assertArrayEquals(dGraph.getIsVisited(), new boolean[5]);
    int[][] expectedDGraph = {
      {0,1,0,0,1},
      {0,0,0,1,0},
      {0,0,0,1,1},
      {0,0,0,0,0},
      {1,0,0,0,0},
    };
    assertArrayEquals(dGraph.getMatrix(), expectedDGraph);
    assertArrayEquals(dGraph.getGraphArr().toArray(), new Integer[0]);
  }
}
