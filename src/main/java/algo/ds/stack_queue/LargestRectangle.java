package algo.ds.stack_queue;

import java.util.Stack;

/**
 * @name LargestRectangle
 * @description Given an array of integers heights representing the histogram's bar height
 * where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 * @example heights = [2, 1, 5, 6, 2, 3] -> 10
 *        _
 *      _| |
 *     |+|+|
 *     |+|+|  _
 *  _  |+|+|_| |
 * | |_|+|+| | |
 * | | |+|+| | |
 * -2-1-5-6-2-3-
 * The above is the a histogram where width of each bar is 1.
 * The largest rectangle is the one created by 5 and 6, which has an area of 2 * 5 = 10 units.
 * @solution Iterate through the heights array, for each bar(height), calculate the area with
 * this element as the smallest bar in the rectangle. Then, we can calculate the such area for every bar and find out the maximum of all such areas.
 * To be specific, for each bar, look at its neighbouring (including left and right) bars until it hits a lower bar or the boundary of the array.
 * Then, the area of this rectangle is just the maximum area for this bar.
 * The worst time complexity is O(n^2)
 * @source https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 */
public class LargestRectangle {
  public static int solution1(int[] heights) {
    int maxArea = 0;
    for(int i = 0; i < heights.length; i++) {
      int height = heights[i];
      int width = 1;
      for(int j = i - 1; j >= 0 && heights[j] >= height; j--) {
        width++;
      }
      for(int k = i+1; k < heights.length && heights[k] >= height; k++) {
        width++;
      }
      int area = height * width;
      if(area > maxArea) maxArea = area;
    }

    return maxArea;
  }

  // Solution2 uses the idea of stacks to improve the above algorithm.
  // The time complexity is improved to O(n)
  // This blog explains the solution well: https://www.danielleskosky.com/largest-rectangle-in-histogram/
  public static int solution2(int[] heights) {
    int maxArea = 0;
    var stack = new Stack<Integer>();
    for(int i = 0; i < heights.length; i++) {
      int height = heights[i];
      if(stack.size() == 0 || height > heights[stack.peek()]) {
        stack.push(i);
      } else {
        while(stack.size() > 0 && heights[stack.peek()] > height) {
          int top = stack.pop();
          int high = i;
          int low = stack.size() > 0 ? stack.peek() : -1;
          int area = heights[top] * (high - low - 1);
          maxArea = Math.max(maxArea, area);
        }
        stack.push(i);
      }
    }

    while(stack.size() > 0) {
      int top = stack.pop();
      int high = heights.length;
      int low = stack.size() > 0 ? stack.peek() : -1;
      int area = heights[top] * (high - low - 1);
      maxArea = Math.max(maxArea, area);
    }

    return maxArea;
  }
}
