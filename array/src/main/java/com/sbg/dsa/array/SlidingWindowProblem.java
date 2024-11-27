package com.sbg.dsa.array;

public class SlidingWindowProblem {

  public static int maxTotalSubArray(int[] array, int k) {

    int left = 0, sum = 0, max = Integer.MIN_VALUE;

    for (int right = 0; right < array.length; right++) {
      sum += array[right];

      if (right - left + 1 == k) {
        max = Math.max(max, sum);
        sum -= array[left];
        left++;
      }
    }

    return max;
  }
}
