package algo.ds.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
   * @param startIndex The index of the starting vertex of the edge to remove.
   * @param endIndex The index of the end vertex of the edge to remove
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

  /**
   * Given the index of a vertex, find its adjacent vertex
   * @param v The index of the vertex
   * @return The index of the adjacent vertext. If not found, return -1.
   */
  public int getFirstAdjacent(int v) {
    for(int i = 0; i < getNumberOfVertexes(); i++) {
      if(matrix[v][i] > 0) return i;
    }
    return -1;
  }

  /**
   * Given the index of a vertex(v1), get its adjacent vertex starting from v2
   * @param v1
   * @param v2
   * @return The index of the adjacent vertex. If not found, return -1.
   */
  public int getNextAdjacent(int v1, int v2) {
    for(int i = v2+1; i < getNumberOfVertexes(); i++) {
      if(matrix[v1][i] > 0) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Depth-first search
   * @param index The index of the vertex from which to start searching.
   */
  private void searchDFSVertex(int index) {
    graphArr.add(getValueByIndex(index));
    isVisited[index] = true;
    int w = getFirstAdjacent(index);
    while(w != -1) {
      if(isVisited[w] == false) {
        searchDFSVertex(w);
      }
      w = getNextAdjacent(index, w);
    }
  }

  /**
   * Do DFS searching for the whole graph.
   * @return A list of DFS searching result.
   */
  public int[] searchDFS() {
    graphArr = new ArrayList<Integer>();
    isVisited = new boolean[getNumberOfVertexes()];
    for(int i = 0; i < getNumberOfVertexes(); i++) {
      if(isVisited[i] == false) {
        searchDFSVertex(i);
      }
    }
    int[] resultArr = graphArr.stream().mapToInt(i -> i).toArray();
    return resultArr;
  }

  /**
   * Broadth-first search
   * @param index The index of the vertex from which to start searching.
   */
  public void searchBFSVertex(int index) {
    var queue = new LinkedList<Integer>();
    int u;
    int adjacent;
    graphArr.add(getValueByIndex(index));
    isVisited[index] = true;
    queue.add(index);
    while(queue.size() > 0) {
      u = queue.poll();
      adjacent = getFirstAdjacent(u);
      while(adjacent != -1) {
        if(isVisited[adjacent] == false) {
          graphArr.add(getValueByIndex(adjacent));
          isVisited[adjacent] = true;
          queue.add(adjacent);
        }
        adjacent = getNextAdjacent(u, adjacent);
      }
    }
  }

  /**
   * Do BFS searching for the whole graph.
   * @return A list of BFS searching result.
   */
  public int[] searchBFS() {
    graphArr = new ArrayList<Integer>();
    isVisited = new boolean[getNumberOfVertexes()];
    for(int i = 0; i < getNumberOfVertexes(); i++) {
      if(isVisited[i] == false) {
        searchBFSVertex(i);
      }
    }
    int[] resultArr = graphArr.stream().mapToInt(i -> i).toArray();
    return resultArr;
  }

  public boolean getUndirected() {
    return undirected;
  }

  public int[] getVertexList() {
    return vertexList;
  }
  
  public int getNumberOfVertexes() {
    return vertexList.length;
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

  public int getWeight(int startIndex, int endIndex) {
    return matrix[startIndex][endIndex];
  }

  public int getValueByIndex(int index) {
    return vertexList[index];
  }
}
