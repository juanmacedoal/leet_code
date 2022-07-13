package easy_level;

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
