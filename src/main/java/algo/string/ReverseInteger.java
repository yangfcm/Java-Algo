package algo.string;
/**
 * @name ReverseInteger
 * @description Reverse an integer number
 * @example reverseInt(521) -> 125, reverseInt(-521) -> -125, reverseInt(1200) -> 21
 */
public class ReverseInteger {
  /** 
   * @param number
   * @return A reversed integer number of int
   * @solution It looks easy, but there are a couple of edge cases to consider:
   * 1. You must keep the sign of the original number, like -521.
   * 2. Consider the number which has trailing zeros, like 1200.
   */
  public static int solution(int number) {
    String numberStr = Integer.toString(Math.abs(number)); // Get the string representing the number
    String reversedNumberStr = new StringBuilder(numberStr).reverse().toString(); // Reverse the string
    return Integer.parseInt(reversedNumberStr) * Integer.signum(number); // Parse reversed string to int
  }
}
