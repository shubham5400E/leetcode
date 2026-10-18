/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    StringBuilder sb=new StringBuilder();
    preorder(sb,root);
    return sb.toString();
    }
    void preorder(StringBuilder sb,TreeNode node){
        if(node==null){
            sb.append("#,");
            return;
        }
        sb.append(node.val).append(",");
        preorder(sb,node.left);
        preorder(sb,node.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }
    TreeNode build(Queue<String> q){
        String val=q.poll();
        if(val.equals("#")){
            return null;
        }
        TreeNode r=new TreeNode(Integer.parseInt(val));
        r.left=build(q);
        r.right=build(q);
        return r;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));