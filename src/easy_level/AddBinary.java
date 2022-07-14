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
    String aux = "0";
    int majorLength = a.length() > b.length() ? a.length() : b.length();
    int minorLength = a.length() > b.length() ? b.length() : a.length();
    for(int i = 0; i < majorLength; i++) {
      boolean in = false;
      int aLength = a.length() - i - 1;
      int bLength = b.length() - i - 1;
      if(i < minorLength) {
        if(a.charAt(aLength) == '1' && b.charAt(bLength) == '1' && aux == "0" && !in) {
          binary = "0" + binary;
          aux = "1";
          in = true;
        }
        if(a.charAt(aLength) == '1' && b.charAt(bLength) == '1' && aux == "1" && !in) {
          binary = "1" + binary;
          aux = "1";
          in = true;
        }
        if(a.charAt(aLength) == '1' && b.charAt(bLength) == '0' && aux == "0" && !in) {
          binary = "1" + binary;
          aux = "0";
          in = true;
        }
        if(a.charAt(aLength) == '0' && b.charAt(bLength) == '1' && aux == "0" && !in) {
          binary = "1" + binary;
          aux = "0";
          in = true;
        }
        if(a.charAt(aLength) == '0' && b.charAt(bLength) == '1' && aux == "1" && !in) {
          binary = "0" + binary;
          aux = "1";
          in = true;
        }
        if(a.charAt(aLength) == '1' && b.charAt(bLength) == '0' && aux == "1" && !in) {
          binary = "0" + binary;
          aux = "1";
          in = true;
        }
        if(a.charAt(aLength) == '0' && b.charAt(bLength) == '0' && aux == "1" && !in) {
          binary = "1" + binary;
          aux = "0";
          in = true;
        }
        if(a.charAt(aLength) == '0' && b.charAt(bLength) == '0' && aux == "0" && !in) {
          binary = "0" + binary;
          aux = "0";
          in = true;
        }
      } else if(aux.equals("1") && aLength > bLength) {
        if(a.charAt(aLength) == '0') {
          binary = "1" + binary;
          aux = "0";
        }
        if(a.charAt(aLength) == '1') {
          binary = "0" + binary;
          aux = "1";
        }
      } else if(aux.equals("0") && aLength > bLength) {
        binary = a.charAt(aLength) + binary;
      }  else if(aux.equals("1") && bLength > aLength) {
        if(b.charAt(bLength) == '0') {
          binary = "1" + binary;
          aux = "0";
        }
        if(b.charAt(bLength) == '1') {
          binary = "0" + binary;
          aux = "1";
        }
      } else if(aux.equals("0") && bLength > aLength) {
        binary = b.charAt(bLength) + binary;
      }


    }

    if(aux == "1") binary = "1" + binary;
    return binary;
  }
}
