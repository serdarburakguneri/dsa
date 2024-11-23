package com.sbg.dsa.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class ReversingProblemTest {

  @Test
  void should_reverse() {
    Node node5 = new Node(5);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(1, node2);

    var reversed = ReversingProblem.reverse(node1);

    List<Integer> values = List.of(5, 4, 3, 2, 1);

    Node tmp = reversed;

    for (int value : values) {
      assertNotNull(tmp);
      assertEquals(value, tmp.getValue());
      tmp = tmp.getNext();
    }
  }
}
