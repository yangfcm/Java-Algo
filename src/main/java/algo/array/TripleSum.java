package algo.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @name TripleSum
 * @description Given 3 arrays of a, b, c of different sizes, find the number of distinct triplets (p, q, r),
 * where p is from a, q from b, r from c, satisfying the criteria: p <= q and q >= r.
 * @example a = [3, 5, 7], b = [3, 6], c = [4, 6, 9] -> 4.
 * There are 4 such distinct triplets. They are: (3, 6, 4), (3, 6, 6), (5, 6, 4), (5, 6, 6).
 * @source https://www.hackerrank.com/challenges/triple-sum
 */
public class TripleSum {

  /**
   * @param a
   * @param b
   * @param c
   * @return The number of triplets defined in the description
   * @solution Iterate through array b. For each element in array b (bn),
   * find out how many numbers in array a smaller than or equal to bn (use variable ai to save the number)
   * and how many numbers in array c smaller than or equal to bn (use variable ci to save the number).
   * So for this particular element - bn, there are ai * ci such triples. Then sum all the counts for each element in array b.
   * While doing iteration, you should not recount the repetitive triplets.
   * We need to do some optimisation before iteration:
   * 1 - Remove duplicate elements from array a, b and c.
   * 2 - Sort the array.
   * By doing so:
   * 1 - we can guarantee each combination is a unique one.
   * 2 - Faster speed.
  */
  public static int solution(Integer[] a, Integer[] b, Integer[] c) {

    var setA = new HashSet<Integer>(Arrays.asList(a));
    a = setA.stream().toArray(n -> new Integer[n]);

    var setB = new HashSet<Integer>(Arrays.asList(b));
    b = setB.stream().toArray(n -> new Integer[n]);

    var setC = new HashSet<Integer>(Arrays.asList(c));
    c = setC.stream().toArray(n -> new Integer[n]); // Remove duplicate elements.
  
    Arrays.sort(a, Collections.reverseOrder());
    Arrays.sort(b, Collections.reverseOrder());
    Arrays.sort(c, Collections.reverseOrder()); // Sort arrays.
    int count = 0;
    int ai = 0;
    int ci = 0;
    for(int bn: b) {
      while(ai < a.length) {
        if(a[ai] <= bn) break;
        ai++;
      }
      while(ci < c.length) {
        if(c[ci] <= bn) break;
        ci++;
      }
      int aCount = a.length - ai;
      int cCount = c.length - ci;
      count += aCount * cCount;
    }

    return count;
  }
}
