package algo.ds.stack_queue;

import java.util.Stack;

/**
 * @name IsBalanced
 * @description Given a string, return true or false to indicate whether the string has balanced brackets.
 * Brackets can be '[]', '{}', or '()'
 * @example s = "{[()]}" -> true
 * s = "{[(])} " -> false
 * s = "{{[[(())]]}}" -> true
 * s = "abcd" -> true  If there is no brackets, we would consider it as balanced. 
 * @solution Use the concept of stack
 * @source https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public class IsBalanced {

  public static boolean solution(String str) {
    var bracketStack = new Stack<Character>();
    for(char ch: str.toCharArray()) {
      if(ch == '(' || ch == '{' || ch == '[') {
        bracketStack.push(ch);
      }
      
      if(
        (ch == ')' && bracketStack.peek() != '(') ||
        (ch == '}' && bracketStack.peek() != '{') ||
        (ch == ']' && bracketStack.peek() != '[')
      ) {
        return false;
      }

      if(
        (ch == ')' && bracketStack.peek() == '(') ||
        (ch == '}' && bracketStack.peek() == '{') ||
        (ch == ']' && bracketStack.peek() == '[')
      ) {
        bracketStack.pop();
      }
    }

    return bracketStack.size() == 0;
  }
}
