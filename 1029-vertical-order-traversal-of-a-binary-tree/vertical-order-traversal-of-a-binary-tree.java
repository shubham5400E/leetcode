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
class Tuple{
    TreeNode Node;
    int n;
    int m;
    Tuple(TreeNode ne,int i,int j){
        Node=ne;
        n=i;
        m=j;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple n=q.poll();
            TreeNode node=n.Node;
            int i=n.n;
            int j=n.m;
            if(!map.containsKey(i)){
                map.put(i,new TreeMap<>());
            }
            if(!map.get(i).containsKey(j)){
                map.get(i).put(j,new PriorityQueue<>());
            }
            map.get(i).get(j).add(node.val);
            if(node.left!=null){
                q.add(new Tuple(node.left,i-1,j+1));
            }
            if(node.right!=null){
                q.add(new Tuple(node.right,i+1,j+1));
            }
        }
        List<List<Integer>> ls=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> m:map.values()){
            ls.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq:m.values()){
                while(!pq.isEmpty()){
                    ls.get(ls.size()-1).add(pq.poll());
                }
            }
        }
        return ls;
    }
}