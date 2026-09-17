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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d=new int[1];
        d[0]=0;
        height(root,d);
        return d[0];
    }
    int height(TreeNode root,int[] d){
        if(root==null)return 0;
        int[] l=new int[1];
        l[0]=height(root.left,d);
        int[] r=new int[1];
        r[0]=height(root.right,d);
        d[0]=Math.max(d[0],l[0]+r[0]);
        return 1+Math.max(l[0],r[0]);

    }
}