package com.sbg.dsa.array;

public class ReversingProblem {

  //Problem 1
  public static void reverse(char[] s) {

    if (s == null || s.length == 0) {
      return;
    }

    int left = 0;
    int right = s.length - 1;

    while (left < right) {
      char tmp = s[left];
      s[left] = s[right];
      s[right] = tmp;

      left++;
      right--;
    }
  }

  //Problem 2
  public static String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int left = 0, right = 0;

    while (right < chars.length) {

      while (right < chars.length && chars[right] != ' ') {
        right++;
      }

      int rleft = left, rright = right - 1; // Exclude the space
      while (rleft < rright) {
        char tmp = chars[rleft];
        chars[rleft] = chars[rright];
        chars[rright] = tmp;

        rleft++;
        rright--;
      }

      right++; // Skip the space
      left = right;
    }

    return new String(chars);
  }
}
