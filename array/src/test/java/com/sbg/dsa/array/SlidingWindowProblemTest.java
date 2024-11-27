package com.sbg.dsa.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SlidingWindowProblemTest {

  @Test
  void should_calculate_max_total_of_sub_array() {

    int[] nums = {1, 12, -5, -6, 50, 3};
    int k = 4;
    double expected = 51;

    int max = SlidingWindowProblem.maxTotalSubArray(nums, k);

    assertEquals(expected, max);
  }
}
