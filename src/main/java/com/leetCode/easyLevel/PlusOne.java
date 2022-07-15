package com.leetCode.easyLevel;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 *
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */
public class PlusOne {
  public int[] plusOne(int[] digits) {
    boolean greatest = false;
    if(digits[0]  == 9 && digits.length < 1) return new int[]{1,0};
    int[] newDigits = new int[digits.length + 1];
    digits[digits.length - 1] = digits[digits.length - 1] + 1;
    for(int i = digits.length - 1; i >= 0; i--) {
      if(digits[i] == 10) {
        if(i == 0) {
          digits[i] = 1;
          newDigits[i] = digits[i];
          greatest = true;
        } else {
          digits[i] = 0;
          digits[i - 1] = digits[i - 1] + 1;
          newDigits[i] = digits[i];
          newDigits[i - 1] = digits[i - 1];
        }
      }
    }
    if(greatest) {
      newDigits[newDigits.length - 1] = 0;
      return newDigits;
    }
    return digits;
  }
}
