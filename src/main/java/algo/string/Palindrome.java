package algo.string;

/**
 * Return true if a given string is palindrome and false if not e.g.!--
 * "racecar" => true, "hello" => false Assume all words are lower case
 */
public class Palindrome {
  public static boolean Run(String str) {
    String reversed = new StringBuffer(str).reverse().toString();
    return reversed.equals(str);
  }
}
