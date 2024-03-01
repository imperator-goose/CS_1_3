package net.ruslan.CS_1_3_4;

import com.sun.source.tree.Tree;

public class Solution {
    static int maxDiameter = 0;

    static int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);

        maxDiameter = Math.max(left + right, maxDiameter);

        return Math.max(left, right) + 1;
    }

    static int diameter(TreeNode node) {
        helper(node);
        return maxDiameter;
    }


    public static void main(String args[]) {

        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        System.out.println(diameter(tree));
    }
}
