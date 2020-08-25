package algo.string;

/**
 * isBalanced - Take a string and return true or false to indicate whether its
 * curly braces are balanced e.g. '}{' - false '{abc}{def}' - true '{abc {def}}'
 * - true 'abc {def}}' = false
 */
public class IsBalanced {
  static public boolean Solution(String str) {
    int count = 0;
    for (char letter : str.toCharArray()) {
      if (letter == '{')
        count++;
      if (letter == '}')
        count--;
      if (count < 0) // If a closing bracket doesn't have a matching opening bracket, return false
                     // early.
        return false;
    }
    return count == 0;
  }
}