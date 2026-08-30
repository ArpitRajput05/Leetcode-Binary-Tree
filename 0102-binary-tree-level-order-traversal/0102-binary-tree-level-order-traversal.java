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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        int h = height(root);

        for (int i = 1; i <= h; i++) {

            List<Integer> level = new ArrayList<>();

            printLevel(root, i, level);

            result.add(level);
        }

        return result;
    }

    
    static int height(TreeNode root) {

        if (root == null) {
            return 0;
        }
        //if(root.left==null&& root.right==null) return 0;
        return 1 + Math.max(
            height(root.left),
            height(root.right)
        );
    }

    
    static void printLevel(
        TreeNode root,
        int level,
        List<Integer> ans
    ) {

        if (root == null) {
            return;
        }

        if (level == 1) {
            ans.add(root.val);
            return;
        }

        printLevel(root.left, level - 1, ans);
        printLevel(root.right, level - 1, ans);
    }
}