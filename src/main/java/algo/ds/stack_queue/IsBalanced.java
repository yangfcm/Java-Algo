package algo.ds.stack_queue;

import java.util.Stack;

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
