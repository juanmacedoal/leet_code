package easy_level;

import java.util.ArrayList;
import java.util.List;

public class IntegerPalindrome {

  public boolean isPalindrome(int x) {

    if (x == 0) return true;
    if (x >= 10 && (x % 10) == 0) return false;
    int x2 = x;
    List<Integer> integerList = new ArrayList<>();
    while (x > 0) {
      integerList.add(x % 10);
      x = x / 10;
    }
    int cont = 1;
    boolean palindrome = false;

    while (x2 > 0) {
      System.out.println(
          "list item: " + integerList.get(integerList.size() - cont) + " division: " + x2 % 10);
      if (integerList.get(integerList.size() - cont).equals(x2 % 10)) palindrome = true;
      else return false;
      x2 = x2 / 10;
      cont++;
    }
    return palindrome;
  }
}
