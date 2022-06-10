import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> triplets = new ArrayList<>();
    for(int i = 0; i < nums.length; i++) {
      for(int j = i+1; j < nums.length; j++) {
        for(int k = j+1;  k < nums.length; k++) {
          int numero = nums[i] + nums[j] + nums[k];
          boolean isRepeated = false;
          if(numero == 0 && i != j && i != k && j != k) {
            for(List<Integer> insideTriplets: triplets) {
              List<Integer> newList = Arrays.asList(nums[i], nums[j], nums[k]);
              System.out.println("InsideList: " + insideTriplets + " newList: " + newList);
              isRepeated = insideTriplets.containsAll(newList) && newList.containsAll(insideTriplets);
              if(isRepeated) break;
            }
            if(!isRepeated || triplets.isEmpty())
              triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
          }
        }
      }

    }
    return triplets;
  }
}
