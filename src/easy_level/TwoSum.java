package easy_level;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      int targetResult = 0;
      targetResult = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        targetResult = targetResult + nums[j];
        if (targetResult == target) {
          return new int[] {i, j};
        }
        targetResult = nums[i];
      }
    }
    return new int[] {};
  }
}
