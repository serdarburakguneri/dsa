package com.sbg.dsa.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversingProblemTest {

  // Problem 1
  @Test
  void should_reverse_string() {

    char[] name = new char[] {'b', 'u', 'r', 'a', 'k'};
    char[] reversedName = new char[] {'k', 'a', 'r', 'u', 'b'};

    ReversingProblem.reverse(name);
    assertArrayEquals(reversedName, name);
  }

  // Problem 2
  @Test
  void should_reverse_single_word() {
    String input = "hello";
    String expected = "olleh";
    assertEquals(expected, ReversingProblem.reverseWords(input));
  }

  @Test
  void should_reverse_multiple_words() {
    String input = "hello world";
    String expected = "olleh dlrow";
    assertEquals(expected, ReversingProblem.reverseWords(input));
  }
}
