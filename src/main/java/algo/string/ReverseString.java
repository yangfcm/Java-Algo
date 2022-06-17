package algo.string;

/**
 * @name reverseString
 * @description Reverse a string
 * @example reverseString('hello') -> 'olleh'
 */
public class ReverseString {
  /** 
   * @param str
   * @return A reversed string
   */
  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
