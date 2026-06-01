class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        find(0,candidates.length,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    void find(int i,int n,int k,int[] arr, List<List<Integer>> ans,List<Integer> ds){
        if(i==n){
            if(k==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(k>=arr[i]){
            ds.add(arr[i]);
            find(i,n,k-arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
        find(i+1,n,k,arr,ans,ds);
    }
}