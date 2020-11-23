package algo.string;

/**
 * Reverse an integer e.g.!-- 521 => 125, -521 => -125, 1200 => 21
 */
public class ReverseInteger {
  public static int solution(int number) {
    String numberStr = Integer.toString(Math.abs(number)); // Get the string representing the number
    String reversedNumberStr = new StringBuilder(numberStr).reverse().toString(); // Reverse the string
    return Integer.parseInt(reversedNumberStr) * Integer.signum(number); // Parse reversed string to int
  }
}
