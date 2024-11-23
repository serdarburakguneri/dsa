package com.sbg.dsa.linkedlist;

public class MergeSortProblem {

  public static Node mergeSort(Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }

    Node middle = getMiddle(head);
    Node nextOfMiddle = middle.getNext();
    middle.setNext(null);

    Node left = mergeSort(head);
    Node right = mergeSort(nextOfMiddle);

    return merge(left, right);
  }

  private static Node getMiddle(Node head) {
    if (head == null) {
      return head;
    }

    Node slow = head;
    Node fast = head;

    while (fast.getNext() != null && fast.getNext().getNext() != null) {
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }

    return slow;
  }

  public static Node merge(Node left, Node right) {
    Node dummy = new Node(0);
    Node current = dummy;
    Node p1 = left;
    Node p2 = right;

    while (p1 != null && p2 != null) {
      if (p1.getValue() < p2.getValue()) {
        current.setNext(p1);
        p1 = p1.getNext();
      } else {
        current.setNext(p2);
        p2 = p2.getNext();
      }
      current = current.getNext();
    }

    if (p1 != null) {
      current.setNext(p1);
    }

    if (p2 != null) {
      current.setNext(p2);
    }

    return dummy.getNext();
  }
}
