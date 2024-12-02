package com.sbg.dsa.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrefixSumProblemTest {

  @Test
  void should_find_sum_of_sub_arrays() {
    int[] input = {1, 2, 3, 4};
    int[] expectedOutput = {1, 3, 6, 10};

    int[] result = PrefixSumProblem.calculatePrefixSums(input);

    assertArrayEquals(expectedOutput, result);
  }
}
