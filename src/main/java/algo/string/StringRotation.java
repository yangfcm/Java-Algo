package algo.string;

/**
 * Given two strings, check if s2 is a rotation of s1 using only one call to
 * Contains. If a string is a rotation of another, it's a rotation at a
 * particular point. e.g. a rotation of "waterbottle" at character 3 means
 * cutting this string at character 3 and putting the right half('erbottle')
 * before the left half('wat') so the result is "erbottlewat"
 */
public class StringRotation {
  public static boolean solution(String str1, String str2) {
    if (str1.length() != str2.length() || str1.length() == 0 || str2.length() == 0) {
      return false;
    }
    return (str1 + str1).contains(str2);
  }
}
