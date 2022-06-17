package algo.string;

import java.util.Arrays;

/**
 * @name CountVowels
 * @description Return the number of vowels used in a string
 * @example "apple" => 2 "why?" => 0
 */
public class CountVowels {
  /**
   * @param str
   * @return The number of vowels in the str
   */
  public static int solution(String str) {
    Character[] vowels = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
    int vowelsCount = 0;
    for (char l : str.toCharArray()) {
      if (Arrays.stream(vowels).anyMatch(x -> x == l)) {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }
}
