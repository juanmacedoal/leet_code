package easy_level;

public class ValidParentheses {

  public boolean isValid(String s) {

    int a = 0;
    int b = 0;
    int c = 0;
    int ab = 0;
    int bb = 0;
    int cb = 0;
    for(int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '(':
          a++;
          break;
        case '{':
          b++;
          break;
        case '[':
          c++;
          break;
        case ')':
          ab++;
          break;
        case '}':
          bb++;
          break;
        case ']':
          cb++;
          break;
      }



    }

    return a == ab && b == bb && c == cb;
  }
}
