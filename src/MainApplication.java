import easy_level.BuildArrayPermutation;
import easy_level.ConcatenationArray;
import easy_level.DefangingAnIPAddres;
import easy_level.FinalValueOfVariableAfterPerformingOperations;
import easy_level.IndexOf;
import easy_level.IntegerPalindrome;
import easy_level.LongPrefix;
import easy_level.MostWordsFound;
import easy_level.RemoveDuplicates;
import easy_level.RemoveElementRepeated;
import easy_level.RichestCustomer;
import easy_level.RemoveOneElement;
import easy_level.RunningSum;
import easy_level.TreeNodeSum;
import easy_level.TwoSum;
import easy_level.ValidParentheses;
import medium_level.ThreeSum;

import java.util.Arrays;

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
    LongPrefix longPrefix = new LongPrefix();
    System.out.println(
        "LongPrefix result: "
            + longPrefix.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
    ValidParentheses validParentheses = new ValidParentheses();
    System.out.println(
        "The result of the valid parentheses is: " + validParentheses.isValid("({{{{}}}))"));
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    System.out.println(
        "The result of removing duplicates: "
            + removeDuplicates.removeDuplicates(new int[] {1, 2, 2}));
    /*
    System.out.println("The result of removing duplicates: " + removeDuplicates.removeDuplicates(new int[]{1,1,1}));
    System.out.println("The result of removing duplicates: " + removeDuplicates.removeDuplicates(new int[]{1,1,2}));
    System.out.println("The result of removing duplicates: " + removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    */
    RunningSum runningSum = new RunningSum();
    System.out.println(
        "The correct result of running sum is: "
            + Arrays.equals(
                runningSum.runningSum(new int[] {1, 2, 3, 4}), new int[] {1, 3, 6, 10}));
    TreeNodeSum threeNodeSum = new TreeNodeSum();
    // System.out.println("The correct result of the threeNodeSum " +
    // threeNodeSum.checkTree([10,4,6]));
    DefangingAnIPAddres defangingAnIPAddres = new DefangingAnIPAddres();
    System.out.println("The result of defanging an ip address 1.1.1.1 need to be equal 1[.]1[.]1[.]1 is"
      + defangingAnIPAddres.defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1"));
    System.out.println("The result of the concatenation arrays: " + Arrays.toString(new ConcatenationArray().getConcatenation(new int[]{1,2,3})));
    System.out.println("The result of Build array from permutation:"  + Arrays.toString(new BuildArrayPermutation().buildArray(new int[]{0,2,1,5,3,4})));
    System.out.println("The result of final value: " + new FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations(
      new String[]{"--X","X++","X++"}));
    System.out.println("The result of the richest man: " + new RichestCustomer().maximumWealth(new int[][]{{1,2},{4,5}}));
    System.out.println(
        "The result of defanging an ip address 1.1.1.1 need to be equal 1[.]1[.]1[.]1 is"
            + defangingAnIPAddres.defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1"));
    System.out.println(
        "The result of the concatenation arrays: "
            + Arrays.toString(new ConcatenationArray().getConcatenation(new int[] {1, 2, 3})));
    System.out.println(
        "The result of Build array from permutation:"
            + Arrays.toString(
                new BuildArrayPermutation().buildArray(new int[] {0, 2, 1, 5, 3, 4})));
    System.out.println(
        "The result of final value: "
            + new FinalValueOfVariableAfterPerformingOperations()
                .finalValueAfterOperations(new String[] {"--X", "X++", "X++"}));
    System.out.println("The result of the remove one: " + new RemoveOneElement().canBeIncreasing(new int[]{13,205,553,527,790,238}));
    System.out.println("The result of the remove repeated element is: " + new RemoveElementRepeated().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    System.out.println("The result of indexOf: " + new IndexOf().strStr("mississippi", "issipi"));



  }
}
