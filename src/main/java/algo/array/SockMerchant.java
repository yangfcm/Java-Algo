package algo.array;

import java.util.*;

/**
 * Given an array of integers representing the color of each sock, determine how
 * many pairs of socks with matching colors there are. For example, there are n
 * = 7 socks with colors arr=[1,2,1,2,1,3,2]. There is one pair of color 1 and
 * one of color 2. There are three odd socks left, one of each color. So the
 * number of pairs is 2.
 */

public class SockMerchant {
  static public int solution(int[] arr) {
    int pairs = 0;
    var socksMap = new Hashtable<Integer, Integer>();
    for (int num : arr) {
      if (socksMap.containsKey(num)) {
        socksMap.put(num, socksMap.get(num) + 1);
      } else {
        socksMap.put(num, 1);
      }
    }
    for (int pair : socksMap.values()) {
      pairs += pair / 2;
    }
    return pairs;
  }
}