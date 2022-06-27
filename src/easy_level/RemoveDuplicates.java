package easy_level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {

    List<Integer> expectedNums = new ArrayList<>();
    List<Integer> listNums = new ArrayList<>();
    int repetitions = 0;
    for(int i = 0; i < nums.length; i++) {
      listNums.add(nums[i]);
      if(!expectedNums.contains(nums[i])) expectedNums.add(nums[i]);
      for(int j = i + 1; j + 1 < nums.length; j++) {
        if(!expectedNums.contains(nums[j])) {
          expectedNums.add(nums[j]);
        }
      }
    }

    for(int i = 0; i < expectedNums.size(); i++) {
      if(Collections.frequency(listNums, expectedNums.get(i)) > 1) repetitions = repetitions + Collections.frequency(listNums, expectedNums.get(i)) - 1;
    }
    System.out.println(expectedNums + " " + repetitions);
    return repetitions;
  }
}
