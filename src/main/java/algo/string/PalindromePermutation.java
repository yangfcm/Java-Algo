package algo.string;

import java.util.HashMap;

/**
 * @name PalindromePermutation
 * @description Given a string, check if it is a permutation of a palindrome.
 * Check is case insensitive.
 * @example "TactCoa" -> true because it has permutations: "tacocat", "atcocta", which are palindromes. 
 */
public class PalindromePermutation {
  /** 
   * @param str
   * @return true if str has permutations which are palindromes, otherwise false.
   * @solution Of course, it is impossible to generate all permutations of a string and test if it is a palindrome one by one.
   * To solve this, create a character map, with key is the characters of the string and value is the occurence of the character.
   * If the string is a permutation of a palindrome, it must have at most one character that has appeared in the string odd-number times.
   */
  public static boolean solution(String str) {
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    String lStr = str.toLowerCase(); // As it is case insensitive, convert the string to lower case.
    for (char ch : lStr.toCharArray()) {
      if (ch == ' ') {
        continue;
      }
      if (charMap.containsKey(ch)) {
        charMap.put(ch, charMap.get(ch) + 1);
      } else {
        charMap.put(ch, 1);
      }
    }
    int countOddTimes = 0;
    for (int value : charMap.values()) {
      if (value % 2 != 0) {
        countOddTimes += 1;
      }
      if (countOddTimes > 1) {
        return false;
      }
    }
    return true;
  }
}
