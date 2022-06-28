package easy_level;

import java.util.Arrays;

public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {

    int repetitions = 0;
    int valueOfI = 0;
    for(int i = 0; i < nums.length; i++) {
      for(int j = i + 1; j + 1 <= nums.length; j++) {
        //System.out.println("i: " + nums[i] + " j-1: " + nums[j - 1] + " j: " + nums[j]);
        if(nums[j - 1] == nums[i]) {
          int aux = nums[j - 1];
          nums[j-1] = nums[j];
          nums[j] = aux;
          if(j + 1 == nums.length) repetitions++;
        }
      }
    }
    System.out.println("nums: " + Arrays.toString(nums));
    return repetitions - 1;
  }
}


