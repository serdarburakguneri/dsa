package com.sbg.dsa.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedTreeCheckProblemTest {

    @Test
    void testIsBalancedWhenTreeIsBalanced() {

        /*
         *      1
         *    /   \
         *   2     3
         *  / \   / \
         * 4   5  6  7
         *
         */

        Node node7 = new Node(7);
        Node node6 = new Node(6);
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node2 = new Node(3, node6, node7);
        Node node3 = new Node(2, node4, node5);
        Node node1 = new Node(1, node2, node3);

        assertTrue(BalancedTreeCheckProblem.isBalanced(node1));
    }

    @Test
    void testIsBalancedWhenTreeIsNotBalanced() {

        /*
         *      1
         *    /   \
         *   2     3
         *  / \
         * 4   5
         *      \
         *       6
         *
         */

        Node node6 = new Node(6);
        Node node5 = new Node(5, null, node6);
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        Node node2 = new Node(2, node4, node5);
        Node node1 = new Node(1, node2, node3);

        assertFalse(BalancedTreeCheckProblem.isBalanced(node1));
    }

}
