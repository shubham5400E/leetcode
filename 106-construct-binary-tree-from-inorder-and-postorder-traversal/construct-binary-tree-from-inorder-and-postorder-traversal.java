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
    int post;
        Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        post=inorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,0,inorder.length-1);
    }
    TreeNode build(int[] postorder,int start,int end){
        if(start>end)return null;
        int temp=postorder[post--];
        TreeNode r=new TreeNode(temp);
        int mid=map.get(temp);
        r.right=build(postorder,mid+1,end);
        r.left=build(postorder,start,mid-1);
        
        return r;
           }
}