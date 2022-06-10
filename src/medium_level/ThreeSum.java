package medium_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This code has a O(n^3) Time complexity solution because of the 3 loops to arrive to the result.
 */
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int numero = nums[i] + nums[j] + nums[k];
          if (numero == 0 && i != j && i != k && j != k) {
            List<Integer> orderList = Arrays.asList(nums[i], nums[j], nums[k]);
            Collections.sort(orderList);
            triplets.add(orderList);
          }
        }
      }
    }

    Set<List<Integer>> set = new HashSet<>(triplets);
    triplets.clear();
    triplets.addAll(set);
    return triplets;
  }
}
