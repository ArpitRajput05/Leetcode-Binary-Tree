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
class Solution {//mysolution

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result=new ArrayList<>();
      int h=  height(root);
      int levels=h+1;
      if(root==null) return result;
      for(int i = 1; i <= levels; i++) {
          
          List<Integer> ans = new ArrayList<>();

           if(i % 2 == 1)
              preorder(root, i, ans);      // Left → Right
             else
             reversePreorder(root, i, ans); // Right → Left

          result.add(ans);
         }
    return result;
    }
    
    public int height(TreeNode root) {

        if(root == null)
            return 0;
        if(root.left==null && root.right==null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
    void preorder(TreeNode root, int level, List<Integer> ans){

       if(root == null)
          return;

      if(level == 1){
          ans.add(root.val);
          return;
        }

       preorder(root.left, level-1, ans);
       preorder(root.right, level-1, ans);
    }
void reversePreorder(TreeNode root, int level, List<Integer> ans){

    if(root == null)
        return;

    if(level == 1){
        ans.add(root.val);
        return;
    }

    reversePreorder(root.right, level-1, ans);
    reversePreorder(root.left, level-1, ans);
}

}