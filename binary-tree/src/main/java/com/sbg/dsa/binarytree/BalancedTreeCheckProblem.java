package com.sbg.dsa.binarytree;

public class BalancedTreeCheckProblem {

    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    private static int checkHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.getLeft());
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(root.getRight());
        if (rightHeight == -1) {
            return -1;
        }

        int heightDiff = Math.abs(leftHeight - rightHeight);
        if (heightDiff > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
