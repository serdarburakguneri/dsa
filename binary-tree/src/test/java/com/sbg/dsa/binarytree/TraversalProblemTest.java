package com.sbg.dsa.binarytree;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraversalProblemTest {

    private Node createBinaryTree() {

        /*
         *     1
         *    / \
         *   2   3
         *  / \
         * 4   5
         *
         */

        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node2 = new Node(2, node4, node5);
        Node node3 = new Node(3);
        return new Node(1, node2, node3);
    }

    @Test
    void testTraverseInOrder() {
        Node root = createBinaryTree();
        List<Integer> result = TraversalProblem.traverseInOrder(root);

        List<Integer> expected = List.of(4, 2, 5, 1, 3);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    void testTraversePreOrder() {
        Node root = createBinaryTree();
        List<Integer> result = TraversalProblem.traversePreOrder(root);

        List<Integer> expected = List.of(1, 2, 4, 5, 3);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    void testTraversePostOrder() {
        Node root = createBinaryTree();
        List<Integer> result = TraversalProblem.traversePostOrder(root);

        List<Integer> expected = List.of(4, 5, 2, 3, 1);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }
}
