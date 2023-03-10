package leetcode;

public class PathSum {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return dfs(root, 0, targetSum);
        }

        public boolean dfs(TreeNode node, int sum, int targetSum) {
            if (node == null) return false;

            if (node.left == null && node.right == null) return sum + node.val == targetSum;

            if (node.left != null && dfs(node.left, sum + node.val, targetSum)) return true;
            if (node.right != null && dfs(node.right, sum + node.val, targetSum)) return true;
            return false;
        }
    }
}
