package com.sbg.dsa.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoopProblemTest {

  @Test
  void should_return_false_when_no_loop_is_present() {
    Node node5 = new Node(5);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(1, node2);

    Assertions.assertFalse(LoopProblem.hasLoop(node1));
  }

  @Test
  void should_return_true_when_loop_is_present() {
    Node node5 = new Node(5);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(1, node2);
    node5.setNext(node3);

    Assertions.assertTrue(LoopProblem.hasLoop(node1));
  }

  @Test
  void should_fix_loop() {
    Node node5 = new Node(5);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node node1 = new Node(1, node2);
    node5.setNext(node3);

    LoopProblem.fixLoop(node1);

    Assertions.assertFalse(LoopProblem.hasLoop(node1));
  }
}
