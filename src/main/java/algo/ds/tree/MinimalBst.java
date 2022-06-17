package algo.ds.tree;

/**
 * @name MinimalBst
 * @description Given a sorted, increasing order array/list with unique integer elements,
 * write a function to create a binary search tree with minimal height.
 * Note: A minimal bst has about the same number of nodes on the left of each node as on the right.
 * @example [1,2,3,4,5,6,7] =>
 *      4
 *    /   \
 *   2     6
 *  / \   / \
 * 1  3  5  7
 */
public class MinimalBst {
  public static Bst solution(int[] arr) {
    return createMinimalBst(arr, 0, arr.length - 1);
  }

  private static Bst createMinimalBst(int[] arr, int start, int end) {
    if(end < start) return null;
    int mid = (start + end) / 2;
    Bst middleNode = new Bst(arr[mid]);
    middleNode.setLeft(createMinimalBst(arr, start, mid-1));
    middleNode.setRight(createMinimalBst(arr, mid+1, end));
    return middleNode;
  }
}
