package com.sbg.dsa.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SlidingWindowProblemTest {

  @Test
  void should_calculate_max_total_of_sub_array() {

    int[] nums = {1, 12, -5, -6, 50, 3};
    int k = 4;
    int expected = 51;

    int max = SlidingWindowProblem.findMaxSum(nums, k);

    assertEquals(expected, max);
  }

  @Test
  void should_find_longest_consecutive_ones() {
    int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
    int k = 2;
    int expected = 6;

    int longest = SlidingWindowProblem.longestOnes(nums, k);

    assertEquals(expected, longest);
  }
}
