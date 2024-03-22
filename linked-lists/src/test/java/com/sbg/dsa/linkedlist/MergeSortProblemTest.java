package com.sbg.dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MergeSortProblemTest {

    @Test
    void testMergeSort() {
        Node node5 = new Node(1);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(2, node4);
        Node node2 = new Node(3, node3);
        Node node1 = new Node(5, node2);

        Node sorted = MergeSortProblem.mergeSort(node1);

        for (int i = 1; i <= 5; i++) {
            assertNotNull(sorted);
            assertEquals(i, sorted.getValue());
            sorted = sorted.getNext();
        }

    }

}
