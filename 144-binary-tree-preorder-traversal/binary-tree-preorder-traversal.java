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
    public List<Integer> preorderTraversal(TreeNode root) {
       List <Integer> ls=new ArrayList<>();
       Preorder(ls,root);
       return ls; 
    }
    void Preorder(List<Integer> ls,TreeNode root){
        if(root==null)return;
        ls.add(root.val);
        Preorder(ls,root.left);
        Preorder(ls,root.right);
    } 
}