/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        calculate(root);
        return ans;
    }

    public void calculate(TreeNode root) {
        if (root == null) return;

        int sum = getSum(root);
        int count = getCount(root);

        int average = sum / count;

        if (average == root.val) {
            ans++;
        }

        calculate(root.left);
        calculate(root.right);
    }

    public int getSum(TreeNode root) {
        if (root == null) return 0;

        return root.val + getSum(root.left) + getSum(root.right);
    }

    public int getCount(TreeNode root) {
        if (root == null) return 0;

        return 1 + getCount(root.left) + getCount(root.right);
    }
}