package algo.array;

import java.util.Arrays;

/**
 * @name ArrayChunk
 * @description Given an array and chunk size, divide the array into many subarrays where each subarray is of length size.
 * @example chunk([1, 2, 3, 4], 2) -> [[1, 2], [3, 4]]
 * chunk([1, 2, 3, 4, 5], 2) -> [[ 1, 2], [3, 4], [5]]
 * chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) -> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
 * chunk([1, 2, 3, 4, 5], 4) -> [[ 1, 2, 3, 4], [5]]
 * chunk([1, 2, 3, 4, 5], 10) -> [[ 1, 2, 3, 4, 5]]
 */
public class ArrayChunk {
  /**
   * @param arr
   * @param size
   * @return An array of chunked arrays.
   * @solution Create an empty array to hold chunks called 'chunked'
   * For each element in the original 'unchunked' array, retrieve the last element in 'chunked'
   * If last element does not exist or if its length is equal to chunk size, push a new chunk
   * into 'chunked' with the current element.
   * Otherwise, add the current element into the current chunk.
   */
  public static int[][] solution(int[] arr, int size) {
    int chunkedSize = arr.length / size + 1;
    int[][] chunked = new int[chunkedSize][];
    int arrIndex = 0;
    int chunkedIndex = 0;
    while (arrIndex < arr.length) {
      // int slicedSize = arrIndex + size > arr.length ? arr.length - arrIndex : size;
      int end = arrIndex + size > arr.length ? arr.length : arrIndex + size;
      int[] sliced = Arrays.copyOfRange(arr, arrIndex, end);
      chunked[chunkedIndex] = sliced;
      arrIndex += size;
      chunkedIndex++;
    }
    return chunked;
  }
}
