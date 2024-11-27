package com.sbg.dsa.array;

public class SlidingWindowProblem {

  // Find a contiguous sub array whose length is equal to k that has the maximum sum value.
  public static int findMaxSum(int[] nums, int k) {

    int sum = 0;

    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    int max = sum;

    for (int i = k; i < nums.length; i++) {
      sum += nums[i] - nums[i - k];
      max = Math.max(max, sum);
    }

    return max;
  }

  // Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the
  // array if you can flip at most k 0's.
  public static int longestOnes(int[] nums, int k) {
    int zeros = 0, longest = 0, left = 0;

    for (int right = 0; right < nums.length; right++) {

      if (nums[right] == 0) {
        zeros++;
      }

      if (zeros > k) {
        if (nums[left++] == 0) {
          zeros--;
        }
      }

      longest = Math.max(longest, right - left + 1);
    }

    return longest;
  }
}
