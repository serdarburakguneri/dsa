package com.sbg.dsa.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeProblemTest {

    @Test
    void testIsBinarySearchTreeWhenTreeIsBST() {
        /*
         *      4
         *    /   \
         *   2     6
         *  / \   / \
         * 1   3  5  7
         *
         */

        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node7 = new Node(7);
        Node node2 = new Node(2, node1, node3);
        Node node6 = new Node(6, node5, node7);
        Node node4 = new Node(4, node2, node6);

        assertTrue(BinarySearchTreeProblem.isBinarySearchTree(node4));
    }

    @Test
    void testIsBinarySearchTreeWhenTreeIsNotBST() {
        /*
         *      4
         *    /   \
         *   2     6
         *  / \   / \
         * 1   3  7  5
         *
         */

        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node7 = new Node(7);
        Node node2 = new Node(2, node1, node3);
        Node node6 = new Node(6, node7, node5);
        Node node4 = new Node(4, node2, node6);

        assertFalse(BinarySearchTreeProblem.isBinarySearchTree(node4));
    }

}
