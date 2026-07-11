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

    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return ans;
    }

    public void dfs(TreeNode node, String path) {

        if (node == null)
            return;

        if (path.equals(""))
            path = String.valueOf(node.val);
        else
            path = path + "->" + node.val;

        // Leaf node
        if (node.left == null && node.right == null) {
            ans.add(path);
            return;
        }

        dfs(node.left, path);
        dfs(node.right, path);
    }
}