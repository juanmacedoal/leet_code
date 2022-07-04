package easy_level;

public class RemoveOneElement {

  public boolean canBeIncreasing(int[] nums) {
    boolean isminor = false;
    int[] finalNums = new int[] {};
    int numberToRemove = 0;
    for (int i = 1; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (nums[j - 1] < nums[j]) isminor = true;
        else {
          isminor = false;
          break;
        }
      }
      if (!isminor) numberToRemove = nums[i - 1];
    }
    if (numberToRemove == 0) {

    };
    else return true;
  }
}
