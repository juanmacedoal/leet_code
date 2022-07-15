package easyLevel;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      if(letter == '(' || letter == '[' || letter == '{') stack.push(letter);
      else if(stack.empty()) return false;
      else if(letter == ')' && stack.pop() != '(') return false;
      else if(letter == ']' && stack.pop() != '[') return false;
      else if(letter == '}' && stack.pop() != '{') return false;
    }
    return stack.empty();
  }
}
