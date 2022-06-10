import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> triplets = new ArrayList<>();
    int x = 0;
    for(int i = 0; i < nums.length; i++) {
      System.out.println("i: " + i + " length: " + (nums.length));
      for(int j = i+1; j < nums.length; j++) {
        System.out.println("j: " + j + " length: " + (nums.length - 1));
        for(int k = j+1;  k < nums.length; k++) {
          System.out.println("k: " + k + " length: " + (nums.length - 2));
          int numero = nums[i] + nums[j] + nums[k];
          boolean isRepeated = false;
          if(numero == 0 && i != j && i != k && j != k) {
            for(List<Integer> insideTriplets: triplets) {
              if((insideTriplets.contains(nums[i])
                && insideTriplets.contains(nums[j])
                && insideTriplets.contains(nums[k]))) {
                isRepeated = true;
              }
            }
            if(!isRepeated) triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
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
