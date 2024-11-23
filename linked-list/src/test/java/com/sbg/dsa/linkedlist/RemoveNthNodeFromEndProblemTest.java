package com.sbg.dsa.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndProblemTest {

  @Test
  void should_remove_nth_from_end() {
    Node node5 = new Node(5);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(1, node2);

    Node current = RemoveNthNodeFromEndProblem.removeNthFromEnd(node1, 2);

    for (int i = 1; i <= 5; i++) {

      if (i == 4) {
        // 4 is removed
        continue;
      }

      assertNotNull(current);
      assertEquals(i, current.getValue());
      current = current.getNext();
    }
  }
}
