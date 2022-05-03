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

  /**
   * Add an edge between two vertexes
   * @param startIndex The index of the starting vertex in vertex list.
   * @param endIndex The index of the end vertex in vertex list.
   * @param weight The weight of the edge.
   */
  public void insertEdge(int startIndex, int endIndex, int weight) {
    if(weight <= 0) throw new Error("Weight must be a number bigger than 0");
    if(matrix[startIndex][endIndex] == 0) {
      matrix[startIndex][endIndex] = weight;
      if(undirected == true) {
        matrix[endIndex][startIndex] = weight;
      }
    }
    numberOfEdges++;
  }

  public void insertEdge(int startIndex, int endIndex) {
    insertEdge(startIndex, endIndex, 1);
  }

  /**
   * Remove an edge between two vertexes
   * @return
   */
  public void removeEdge(int startIndex, int endIndex) {
    if(matrix[startIndex][endIndex] != 0) {
      matrix[startIndex][endIndex] = 0;
      if(undirected == true) {
        matrix[endIndex][startIndex] = 0;
      }
    }
    numberOfEdges--;
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
