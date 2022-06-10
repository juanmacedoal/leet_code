import easy_level.IntegerPalindrome;
import easy_level.TwoSum;
import medium_level.ThreeSum;

public class MainApplication {

  public static void main(String[] args) {

    TwoSum twoSum = new TwoSum();
    twoSum.twoSum(new int[] {3, 2, 3}, 6);
    ThreeSum threeSum = new ThreeSum();
    System.out.println(
        "ThreeSum result: "
            + threeSum.threeSum(
                new int[] {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0}));

    IntegerPalindrome integerPalindrome = new IntegerPalindrome();
    System.out.println("Is an integer palindrome: " + integerPalindrome.isPalindrome(121));
  }
}
