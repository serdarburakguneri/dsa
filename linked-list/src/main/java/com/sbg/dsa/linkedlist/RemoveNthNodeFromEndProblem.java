package com.sbg.dsa.linkedlist;

public class RemoveNthNodeFromEndProblem {

  public static Node removeNthFromEnd(Node head, int n) {
    Node dummy = new Node(0);
    dummy.setNext(head);
    Node slow = dummy;
    Node fast = dummy;

    for (int i = 0; i <= n; i++) {
      fast = fast.getNext();
    }

    while (fast != null) {
      slow = slow.getNext();
      fast = fast.getNext();
    }

    slow.setNext(slow.getNext().getNext());

    return dummy.getNext();
  }
}
