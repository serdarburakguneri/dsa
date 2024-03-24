package com.sbg.dsa.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TraversalProblem {

    public static List<Integer> traverseInOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        fillListInOrder(root, result);
        return result;
    }

    private static void fillListInOrder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        fillListInOrder(root.getLeft(), result);
        result.add(root.getValue());
        fillListInOrder(root.getRight(), result);
    }

    public static List<Integer> traversePreOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        fillListPreOrder(root, result);
        return result;
    }

    private static void fillListPreOrder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.getValue());
        fillListPreOrder(root.getLeft(), result);
        fillListPreOrder(root.getRight(), result);
    }

    public static List<Integer> traversePostOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        fillListPostOrder(root, result);
        return result;
    }

    private static void fillListPostOrder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        fillListPostOrder(root.getLeft(), result);
        fillListPostOrder(root.getRight(), result);
        result.add(root.getValue());
    }

}
