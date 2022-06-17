package algo.string;

/**
 * @name Palindrome
 * @description Return true if a given string is palindrome and false if not.
 * A palindrome is a string whose reversed string is exactly the same as the original.
 * @example palindrome('racecar') === 'true', palindrome('hello') == false 
 */
public class Palindrome {
  /** 
   * @param str
   * @return true if str is palindrome, otherwise false.
   * @solution As per the definition of palindrome, reverse a string and compare it to the original one.
   */
  public static boolean Run(String str) {
    String reversed = new StringBuffer(str).reverse().toString();
    return reversed.equals(str);
  }
}
