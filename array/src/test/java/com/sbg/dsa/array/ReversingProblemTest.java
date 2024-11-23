package com.sbg.dsa.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReversingProblemTest {

  @Test
  void should_reverse() {

    char[] name = new char[] {'b', 'u', 'r', 'a', 'k'};
    char[] reversedName = new char[] {'k', 'a', 'r', 'u', 'b'};

    ReversingProblem.reverse(name);

    assertArrayEquals(reversedName, name);
  }
}
