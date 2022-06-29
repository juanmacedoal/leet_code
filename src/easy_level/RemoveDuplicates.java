package easy_level;

import java.util.Arrays;

public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {

    int repetitions = 0;
    int allRepeated = 0;
    if(nums.length == 1) return 1;
    for(int i = 0; i + 1 < nums.length; i++) {
      if(nums[i] == nums[i+1]) allRepeated++;
    }
    if(allRepeated == nums.length - 1 || (nums.length - allRepeated - 1) == 1) return 1;
    for(int i = 0; i + 1 < nums.length; i++) {
    int inWhile = 0;
      while(nums[i] == nums[i + 1] && i + 1 != (nums.length-1)) {
          for(int j = i + 1; j + 1 < nums.length; j++) {
            int aux = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = aux;
          }
          if(inWhile == 0) inWhile ++;
      }
      repetitions = repetitions + inWhile;
      if(nums[i] == nums[i + 1] && repetitions == 0) repetitions = 1;
    }
    System.out.println("nums: " + Arrays.toString(nums));

    return nums.length - repetitions;
  }
}


