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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        check(root);
        return ans;
    }
    int check(TreeNode root){
        if(root==null)return 0;
        int l=Math.max(0,check(root.left));
        int r=Math.max(0,check(root.right));
        int c=root.val+l+r;
        ans=Math.max(ans,c);
        return root.val+Math.max(l,r);
    }
}