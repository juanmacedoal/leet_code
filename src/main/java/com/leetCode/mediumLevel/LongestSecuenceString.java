package com.leetCode.mediumLevel;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSecuenceString {

  public int lengthOfLongestSubstring(String s) {
    long startTime = System.nanoTime();

    if(s.isEmpty()) return 0;
    String a = "";
    String c = "";
    int i = 0;
    StringBuilder stringBuilder = new StringBuilder();
    a: for(char first: s.toCharArray()) {
      b: for(int j = i; j < s.length(); j++) {
        if(!stringBuilder.toString().contains(String.valueOf(s.charAt(j)))) {
          stringBuilder.append(s.charAt(j));
        } else if(s.substring(i, s.length()).length() > stringBuilder.toString().length()) {
          if(stringBuilder.toString().length() > a.length()) a = stringBuilder.toString();
          stringBuilder.setLength(0);
          stringBuilder.append(s.charAt(j));
        } else break a;
      }
      if(stringBuilder.toString().length() > c.length()) c = stringBuilder.toString();
      if(a.length() > c.length()) c = a;
      stringBuilder.setLength(0);
      i++;
    }
    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;
    //System.out.println(totalTime);
    return a.length() > stringBuilder.toString().length() ? a.length() : stringBuilder.toString().length();
  }
}

/**
 *   public int lengthOfLongestSubstring(String s) {
 *     if(s.isEmpty()) return 0;
 *     String a = "";
 *     String c = "";
 *     int i = 0;
 *     StringBuilder stringBuilder = new StringBuilder();
 *     for(char first: s.toCharArray()) {
 *       for(int j = i; j < s.length(); j++) {
 *         if(!stringBuilder.toString().contains(String.valueOf(s.charAt(j)))) {
 *           stringBuilder.append(s.charAt(j));
 *         } else {
 *           if(stringBuilder.toString().length() > a.length()) a = stringBuilder.toString();
 *           stringBuilder.setLength(0);
 *           stringBuilder.append(s.charAt(j));
 *         }
 *       }
 *       if(stringBuilder.toString().length() > c.length()) c = stringBuilder.toString();
 *       if(a.length() > c.length()) c = a;
 *       stringBuilder.setLength(0);
 *       i++;
 *     }
 *     return a.length() > c.length() ? a.length() : c.length();
 *   }
 */
