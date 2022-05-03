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
  public void testInitialization() {
    assertArrayEquals(new int[]{1,2,3,4,5}, uGraph.getVertexList());
    assertEquals(uGraph.getUndirected(), true);
    assertEquals(uGraph.getNumberOfEdges(), 5);
    assertEquals(uGraph.getNumberOfVertexes(), 5);
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
    assertEquals(dGraph.getNumberOfVertexes(), 5);
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

  @DisplayName("Test insertEdge method")
  @Test
  public void testInsertEdge() {
    uGraph.insertEdge(1, 2);
    assertEquals(uGraph.getNumberOfEdges(), 6);
    assertEquals(uGraph.getMatrix()[1][2], 1);
    assertEquals(uGraph.getMatrix()[2][1], 1);
    uGraph.insertEdge(1, 4, 9); // Test inserting an edge with weight.
    assertEquals(uGraph.getNumberOfEdges(), 7);
    assertEquals(uGraph.getMatrix()[1][4], 9);
    assertEquals(uGraph.getMatrix()[4][1], 9);

    dGraph.insertEdge(0, 3);
    assertEquals(dGraph.getNumberOfEdges(), 7);
    assertEquals(dGraph.getMatrix()[0][3], 1);
    assertEquals(dGraph.getMatrix()[3][0], 0);

    dGraph.insertEdge(1, 4, 9);
    assertEquals(dGraph.getMatrix()[1][4], 9);
    assertEquals(dGraph.getMatrix()[4][1], 0);
  }

  @DisplayName("Test removeEdge method")
  @Test
  public void testRemoveEdge() {
    uGraph.removeEdge(1, 3);
    assertEquals(uGraph.getNumberOfEdges(), 4);
    assertEquals(uGraph.getMatrix()[1][3], 0);
    assertEquals(uGraph.getMatrix()[3][1], 0);

    dGraph.removeEdge(1, 3);
    assertEquals(dGraph.getNumberOfEdges(), 5);
    assertEquals(dGraph.getMatrix()[1][3], 0);

  }
}
