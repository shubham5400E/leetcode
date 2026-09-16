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
    public List<Integer> inorderTraversal(TreeNode root) {
       List <Integer> ls=new ArrayList<>();
       Check(ls,root);
       return ls; 
    }
    void Check(List<Integer> ls,TreeNode root){
        if(root==null)return;
        Check(ls,root.left);
        ls.add(root.val);
        Check(ls,root.right);
    } 
}