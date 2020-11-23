package algo.string;

import java.util.Arrays;

/**
 * Return the number of vowels used in a string e.g.!-- "apple" => 2 "why?" => 0
 */
public class CountVowels {
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
