package algo.assorted;

import java.util.Arrays;

/**
 * @name minTime
 * @description You are planning production for an order.
 * You have a number of machines that each have a fixed number of days to produce an item.
 * Given that all the machines operate simultaneously,
 * determine the minimum number of days to produce the required order.
 * @example machines = [2, 3, 2], goal = 10 -> 8
 * There are three machines, and machine 1 and 3 needs to spend 2 days to produce one item;
 * machine 2 spend 3 days to product one item.
 * The schedule is as below:
 * Day | Production | Finished items
 * ---------------------------------
 * 1   | 0          | 0
 * 2   | 2          | 2
 * 3   | 1          | 3
 * 4   | 2          | 5
 * 5   | 0          | 5
 * 6   | 3          | 8
 * 7   | 0          | 8
 * 8   | 2          | 10
 * So on day 8, we can product 10 items which reaches the goal.
 * @source https://www.hackerrank.com/challenges/minimum-time-required
 */
public class MinTime {

  /**
   * @param machines
   * @param goal
   * @return The minimum days required to product the target items.
   * @solution Use the concept of binary search.
   */
  public static int solution(int[] machines, int goal) {
    int days = 0;
    int minMachine = Arrays.stream(machines).min().getAsInt();  // The minimum element in machines array.
    int maxMachine = Arrays.stream(machines).max().getAsInt();  // The maximum element in machines array.
    int minDays = goal * minMachine / machines.length;
    int maxDays = goal * maxMachine / machines.length;
    
    while(true) {
      int mid = (minDays + maxDays) / 2;
      if(minDays == mid || maxDays == mid) break;
      if(dailyOutcome(machines, mid) < goal) {
        minDays = mid;
      }
      else {
        maxDays = mid;
      }

      days = Math.max(minDays, maxDays);
    }    

    return days;
  }

  /**
   * @param machines
   * @param k
   * @return How many items are produced by the end of k-th day with the given machines
   */
  private static int dailyOutcome(int[] machines, int k) {
    int items = 0;
    for(int m: machines) {
      items += k/m;
    }
    return items;
  }
}
