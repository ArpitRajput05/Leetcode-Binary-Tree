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
    public int minDepth(TreeNode root) {
       if(root==null) return 0;
        int h=height(root);
        int l=h+1;
        return l; 
    }
    public int height(TreeNode root){
         if(root==null) return 0;
         if(root.left==null&&root.right==null)return 0;
         if(root.left==null) return 1+height(root.right);
         if(root.right==null)return 1+height(root.left);
        return 1 + Math.min(height(root.left), height(root.right));
    }
}