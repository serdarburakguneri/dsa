package com.sbg.dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MergingTwoSortedListsProblemTest {

  @Test
  void should_merge() {
    Node node5 = new Node(5);
    Node node3 = new Node(3, node5);
    Node node1 = new Node(1, node3);

    Node node6 = new Node(6, null);
    Node node4 = new Node(4, node6);
    Node node2 = new Node(2, node4);

    Node merged = MergingTwoSortedListsProblem.merge(node1, node2);

    for (int i = 1; i <= 6; i++) {
      assertNotNull(merged);
      assertEquals(i, merged.getValue());
      merged = merged.getNext();
    }
  }
}
