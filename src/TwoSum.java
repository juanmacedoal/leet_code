import java.util.ArrayList;
import java.util.List;

class TwoSum {
  public int[] twoSum(int[] nums, int target) {

    int[] indexes;
    List<Integer> indexesList = listOfIndexes(nums, target);
    indexes = new int[indexesList.size()];
    for(int i = 0; i < indexesList.size(); i++) {
      indexes[i] = indexesList.get(i);
    }
    return indexes;
  }

  public List<Integer> listOfIndexes(int[] nums, int target) {
    List<Integer> indexesList = new ArrayList<>();
    for(int i = 0; i < nums.length; i++) {
      int targetResult = 0;
      targetResult = nums[i];
      for(int j = i+1; j < nums.length; j++) {
        targetResult = targetResult + nums[j];
        indexesList.add(i);
        indexesList.add(j);
        if(targetResult == target) {
          System.out.println("Target result: " + indexesList.toString());
          return indexesList;
        }
        indexesList.clear();
        targetResult = nums[i];
      }
    }
    return indexesList;
  }
}
