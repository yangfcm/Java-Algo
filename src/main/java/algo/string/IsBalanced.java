package algo.string;

/**
 * @name Isbalanced
 * @description Given a string and return true or false to indicate whether its curly braces are balanced
 * @example '}{' -> false
 * '{abc}{def}' -> true
 * '{abc {def}}' -> true
 * 'abc {def}}' -> false
 */
public class IsBalanced {
  /**
   * @param str
   * @returns true if str has balanced curly braces, otherwise false.
   * @solution Use a variable to save the number of left curly braces. Iterate the string,
   * If you see a {, increment the variable and if you see a }, decrement the variable.
   * The variable should be 0 if the curly braces are balanced.
   */
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