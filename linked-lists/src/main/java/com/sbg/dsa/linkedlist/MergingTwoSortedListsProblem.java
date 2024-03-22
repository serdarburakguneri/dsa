package com.sbg.dsa.linkedlist;

public class MergingTwoSortedListsProblem {

    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;
        Node p1 = head1;
        Node p2 = head2;

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
