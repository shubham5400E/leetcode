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
    public boolean isSymmetric(TreeNode root) {
        if(root.right==null && root.left ==null)return true; 
        if(root.right==null || root.left ==null)return false; 
        return same(root.right,root.left);
    }
    boolean same(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q==null|| p.val!=q.val)return false;
        return same(p.left,q.right) && same(p.right,q.left);
    }
}