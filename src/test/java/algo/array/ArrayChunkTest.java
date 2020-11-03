package algo.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test array/ArrayChunk")
public class ArrayChunkTest {
  @DisplayName("Test case with array of {1,2,3,4,5} and size 1")
  @Test
  public void TestCase1() {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    int[][] chunked = ArrayChunk.solution(arr, 1);
    int[][] expectedChunk = { new int[] { 1 }, new int[] { 2 }, new int[] { 3 }, new int[] { 4 }, new int[] { 5 } };
    for (int i = 0; i < chunked.length - 1; i++) {
      assertArrayEquals(chunked[i], expectedChunk[i]);
    }
  }

  @DisplayName("Test case with array of {1,2,3,4,5} and size 2")
  @Test
  public void TestCase2() {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    int[][] chunked = ArrayChunk.solution(arr, 2);
    int[][] expectedChunk = { new int[] { 1, 2 }, new int[] { 3, 4 }, new int[] { 5 } };
    for (int i = 0; i < chunked.length - 1; i++) {
      assertArrayEquals(chunked[i], expectedChunk[i]);
    }
  }

  @DisplayName("Test case with array of {1,2,3,4,5,6,7,8,9,10,11,12,13} and size 4")
  @Test
  public void TestCase3() {
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int[][] chunked = ArrayChunk.solution(arr, 4);
    int[][] expectedChunk = { new int[] { 1, 2, 3, 4 }, new int[] { 5, 6, 7, 8 }, new int[] { 9, 10, 11, 12 },
        new int[] { 13 } };
    for (int i = 0; i < chunked.length - 1; i++) {
      assertArrayEquals(chunked[i], expectedChunk[i]);
    }
  }
}
