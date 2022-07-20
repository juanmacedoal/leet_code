package com.leetCode;

import com.leetCode.easyLevel.AddBinary;
import com.leetCode.easyLevel.BuildArrayPermutation;
import com.leetCode.easyLevel.ConcatenationArray;
import com.leetCode.easyLevel.DefangingAnIPAddres;
import com.leetCode.easyLevel.FinalValueOfVariableAfterPerformingOperations;
import com.leetCode.easyLevel.IndexOf;
import com.leetCode.easyLevel.IntegerPalindrome;
import com.leetCode.easyLevel.LongPrefix;
import com.leetCode.easyLevel.PlusOne;
import com.leetCode.easyLevel.RemoveDuplicates;
import com.leetCode.easyLevel.RemoveElementRepeated;
import com.leetCode.easyLevel.RichestCustomer;
import com.leetCode.easyLevel.RemoveOneElement;
import com.leetCode.easyLevel.RunningSum;
import com.leetCode.easyLevel.TreeNodeSum;
import com.leetCode.easyLevel.TwoSum;
import com.leetCode.easyLevel.ValidParentheses;
import com.leetCode.mediumLevel.LongestSecuenceString;
import com.leetCode.mediumLevel.ThreeSum;

import javax.swing.*;
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
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
  //  System.out.println("The result of removing duplicates: " + removeDuplicates.removeDuplicates(new int[]{1,1,1}));
  //  System.out.println("The result of removing duplicates: " + removeDuplicates.removeDuplicates(new int[]{1,1,2}));
    System.out.println("The result of removing duplicates: " + removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    System.out.println("The result of plusOne: " + new PlusOne().plusOne(new int[]{8,9,9,9}).equals(new int[]{1,0,0}));
    System.out.println("The result of add binary: " + new AddBinary().addBinary("100", "110010"));
    System.out.println("The result of the longestSecuenceString: " + new LongestSecuenceString().lengthOfLongestSubstring("anviaj"));
  }
}
