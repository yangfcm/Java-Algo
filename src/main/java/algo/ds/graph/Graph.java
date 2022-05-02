package algo.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
  private boolean undirected; // A flag to indicate the graph is a directed or undirected graph. True - undirected, False - directed.
  private int[] vertexList; // A list of vertexes in the graph.
  private int numberOfEdges;  // How many edges in the graph
  private int[][] matrix; // A two-dimensional array to represent a graph.
  private boolean[] isVisited; // An array to record if a vertex at index i is visited or not.
  private List<Integer> graphArr; // An array to store the traverse result of a graph.

  public Graph(int[] vertexList) {
    // Graph initialisation.
    undirected = true;
    this.vertexList = Arrays.copyOf(vertexList, vertexList.length);
    numberOfEdges = 0;
    int numberOfVertex = vertexList.length;
    matrix = new int[numberOfVertex][numberOfVertex];
    isVisited = new boolean[numberOfVertex];
    graphArr = new ArrayList<Integer>();
  }

  public Graph(int[] vertexList, boolean undirected) {
    this(vertexList);
    this.undirected = undirected;
  }

  public boolean getUndirected() {
    return undirected;
  }

  public int[] getVertexList() {
    return vertexList;
  }

  public int getNumberOfEdges() {
    return numberOfEdges;
  } 

  public int[][] getMatrix() {
    return matrix;
  }

  public boolean[] getIsVisited() {
    return isVisited;
  }

  public List<Integer> getGraphArr() {
    return graphArr;
  }
}
