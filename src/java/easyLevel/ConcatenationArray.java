package easyLevel;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * Specifically, ans is the concatenation of two nums arrays.
 *
 * Return the array ans.
 *
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 */
public class ConcatenationArray {

  public int[] getConcatenation(int[] nums) {
    int cont = 0;
    int[] newNums = new int[nums.length * 2];
    int i = 0;
    while(i <= nums.length - 1 && cont < newNums.length) {
      newNums[cont] = nums[i];
      i++;
      if(i == nums.length) i = 0;
      cont++;
    }
    return newNums;
  }
}

/**
 *
 * Better way
 *
 *     public int[] getConcatenation(int[] nums) {
 *         int ans[]=new int[2*nums.length];
 *         for(int i=0;i<nums.length;i++)
 *
 *         {
 *           ans[i]=nums[i];
 *             ans[i+nums.length]=nums[i];
 *         }
 *         return ans;
 *     }
 */
