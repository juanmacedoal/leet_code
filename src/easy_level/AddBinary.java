package easy_level;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 */
public class AddBinary {
  public String addBinary(String a, String b) {
    String binary = "";
    char aux = '0';
    int minorLength = a.length() > b.length() ? b.length() : a.length();
    for(int i = minorLength - 1; i >= 0; i--) {
      if(a.charAt(i) == '1' && b.charAt(i) == '1' && aux == '0') {
        binary = binary + "0";
        aux = 1;
      }
      if(a.charAt(i) == '1' && b.charAt(i) == '1' && aux == '1') {
        binary = binary + "1";
        aux = 0;
      }
      if(a.charAt(i) == '1' && b.charAt(i) == '0' && aux == '0') {
        binary = binary + "1";
        aux = 0;
      }
      if(a.charAt(i) == '0' && b.charAt(i) == '1' && aux == '0') {
        binary = binary + "1";
        aux = 0;
      }
      if(a.charAt(i) == '0' && b.charAt(i) == '1' && aux == '1') {
        binary = binary + "0";
        aux = '1';
      }
      if(a.charAt(i) == '1' && b.charAt(i) == '0' && aux == '1') {
        binary = binary + "0";
        aux = '1';
      }

    }
    return binary;
  }
}
