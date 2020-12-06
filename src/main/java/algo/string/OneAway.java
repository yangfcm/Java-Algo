package algo.string;

/**
 * There are three types of edits that can be performed on a string: insert a
 * character, remove a character or replace a character. Given two strings,
 * check if they are one edit(or zero edit) away. e.g. pale, ple -> true(remove
 * a character) pale, pales -> true(add a character) pale, bale -> true(replace
 * a character) pale, bake -> false
 */
public class OneAway {
  public static boolean solution(String str1, String str2) {
    int lengthDiff = Math.abs(str1.length() - str2.length());
    if (lengthDiff > 1) {
      // If two strings' length difference is bigger than 1, return false early.
      return false;
    }

    // If two strings have same length, return true if there is one or zero
    // different characters; otherwise return false
    if (lengthDiff == 0) {
      int diffCount = 0;
      for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
          diffCount++;
        }
        if (diffCount > 1) {
          return false;
        }
      }
      return true;
    }

    // If two strings lengths are different and their difference is only one.
    // Remove the first different character from the longer string and check again.
    // If there is still different characters, return false. Otherwise, return true.
    if (lengthDiff == 1) {
      String longer, shorter, compareStr = "";
      longer = str1.length() > str2.length() ? str1 : str2;
      shorter = str1.length() < str2.length() ? str1 : str2;
      for (int i = 0; i < longer.length(); i++) {
        if (i == longer.length() - 1) {
          compareStr = longer.substring(0, i);
        } else if (longer.charAt(i) != shorter.charAt(i)) {
          compareStr = longer.substring(0, i) + longer.substring(i + 1);
        }
      }
      for (int i = 0; i < compareStr.length(); i++) {
        if (compareStr.charAt(i) != shorter.charAt(i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
