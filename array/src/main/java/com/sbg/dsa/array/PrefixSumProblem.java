package com.sbg.dsa.array;

public class PrefixSumProblem {

  public static int[] calculatePrefixSums(int[] nums) {

    if (nums == null) {
      return null;
    } else if (nums.length == 0 || nums.length == 1) {
      return nums.clone();
    }

    int[] sums = new int[nums.length];
    sums[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
      sums[i] = nums[i] + sums[i - 1];
    }

    return sums;
  }
}
