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

    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            int prev;

            if (level % 2 == 0)
                prev = Integer.MIN_VALUE;
            else
                prev = Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();

                // Even level
                if (level % 2 == 0) {

                    if (temp.val % 2 == 0)
                        return false;

                    if (temp.val <= prev)
                        return false;

                }

                // Odd level
                else {

                    if (temp.val % 2 != 0)
                        return false;

                    if (temp.val >= prev)
                        return false;

                }

                prev = temp.val;

                if (temp.left != null)
                    q.offer(temp.left);

                if (temp.right != null)
                    q.offer(temp.right);

            }

            level++;
        }

        return true;
    }
}