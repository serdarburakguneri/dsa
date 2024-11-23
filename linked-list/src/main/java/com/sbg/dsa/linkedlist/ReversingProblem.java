package com.sbg.dsa.linkedlist;

public class ReversingProblem {

  public static Node reverse(Node head) {
    Node previous = null;
    Node current = head;
    Node next = null;

    while (current != null) {
      next = current.getNext();
      current.setNext(previous);
      previous = current;
      current = next;
    }

    return previous;
  }
}
