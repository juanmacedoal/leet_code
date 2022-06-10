public class MainApplication {

  public static void main(String[] args) {

    TwoSum twoSum = new TwoSum();
    //twoSum.twoSum(new int[]{3, 2, 3}, 6);
    ThreeSum threeSum = new ThreeSum();
    //threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
    //threeSum.threeSum(new int[]{-1,0,1,0});
    //System.out.println("ThreeSum result: " + threeSum.threeSum(new int[]{-2, 0,1,1,2}));
    //System.out.println("ThreeSum result: " + threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    System.out.println("ThreeSum result: " + threeSum.threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0}));


  }
}
