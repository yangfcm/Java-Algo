package algo.string;

/**
 * @name stringRotation
 * @description Assume you have a function isSubstring which checks if one word is a substring of another.
 * Given two strings, check if s2 is a rotation of s1 using ONLY one call to isSubstring.
 * If a string is a rotation of another, it's a rotation at a particular point.
 * @example "waterbottle" and "erbottlewat" -> true
 * A rotation of "waterbottle" at character 3 means cutting this string at character 3 and
 * putting the right half('erbottle') before the left half('wat') so the result is "erbottlewat"
 */
public class StringRotation {
  /** 
   * @param str1
   * @param str2
   * @return True if str1 is the rotation of str2. Otherwise, false.
   * @solution The solution is not straightfoward and quite clever. It checks if str2 is the concatenation of two str1-s.
   */
  public static boolean solution(String str1, String str2) {
    if (str1.length() != str2.length() || str1.length() == 0 || str2.length() == 0) {
      return false;
    }
    return (str1 + str1).contains(str2);
  }
}
