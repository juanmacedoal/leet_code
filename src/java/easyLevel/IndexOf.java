package easyLevel;

/**
 * Implement strStr().
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 *
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */
public class IndexOf {
  public int strStr(String haystack, String needle) {

    if(needle == haystack) return 0;
    if(needle.length() > haystack.length()) return -1;
    int indexOf = 0;
    int cont = 0;
    int cont2 = 0;
    int cont3 = 0;
    boolean exist = false;
    while(cont < needle.length() && cont3 < haystack.length()){
        if(haystack.charAt(cont3) == needle.charAt(cont)) {
          indexOf = cont2;
          cont++;
          cont3++;
          exist = true;
        } else {
          exist = false;
          cont = 0;
          cont2++;
          cont3 = cont2;
        }
      }

    if(cont <= needle.length() - 1) exist = false;
    return exist ? indexOf: -1;
  }
}
