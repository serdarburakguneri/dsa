package com.sbg.dsa.binarytree;

public class BinarySearchTreeProblem {

    public static boolean isBinarySearchTree(Node root) {
        return checkValueDistribution(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkValueDistribution(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.getValue() < min || root.getValue() > max) {
            return false;
        }

        return checkValueDistribution(root.getLeft(), min, root.getValue())
                && checkValueDistribution(root.getRight(), root.getValue(), max);
    }

}
