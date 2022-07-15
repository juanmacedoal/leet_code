package easyLevel;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.
 *
 * The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
 *
 * Example 1:
 *
 * Input: nums = [1,2,10,5,7]
 * Output: true
 * Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
 * [1,2,5,7] is strictly increasing, so return true.
 *
 * ------------BETTER SOLUTION-------------
 *
 * // One Pass Solution
 * // When we find decreasing or equal (nums[i] <= nums[i-1]):
 * // If nums[i] > nums[i-2], remove nums[i-1] (Ignore nums[i-1]).
 * // Otherwise, remove nums[i] (Set nums[i] = nums[i-1]).
 * // Time complexity: O(N)
 * class Solution {
 *     public boolean canBeIncreasing(int[] nums) {
 *         if (nums == null || nums.length <= 2) return true;
 *         boolean removed = false;
 *         for (int i = 1; i < nums.length; i++) {
 *             if (nums[i] <= nums[i-1]) {
 *                 if (removed) {
 *                     return false;
 *                 }
 *                 removed = true;
 *                 if (i > 1 && nums[i] <= nums[i - 2]) {
 *                     nums[i] = nums[i-1];
 *                 }
 *             }
 *         }
 *         return true;
 *     }
 * }
 */
public class RemoveOneElement {

  public boolean canBeIncreasing(int[] nums) {
    boolean isminor = false;
    List<Integer> finalNums = new ArrayList<>();
    int numberToRemove = 0;
    for (int i = 0; i+1 < nums.length; i++) {
      if (nums[i] < nums[i+1]) {
        if(numberToRemove != nums[i])
        finalNums.add(nums[i]);
      } else {
        if(numberToRemove != 0) return false;
        if(i+2 < nums.length) {
          if(nums[i] < nums[i+2]) {
            numberToRemove = nums[i + 1];
            finalNums.add(nums[i]);
          } else {
            if(nums[i+1] > nums[i+2]) return false;
            numberToRemove = nums[i];
          }
        }
      }
    }
    if(finalNums.size() == nums.length - 2) finalNums.add(nums[nums.length - 1]);
    if(numberToRemove == 0 || finalNums.size() == 1) return true;
    for(int i = 0; i + 1 < finalNums.size(); i++) {
      if (finalNums.get(i) < finalNums.get(i+1)) {
        isminor = true;
      } else {
        return false;
      }
    }
    return isminor;
  }
}
