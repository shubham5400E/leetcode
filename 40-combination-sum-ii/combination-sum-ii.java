class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        find(0,candidates.length,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    void find(int i,int n,int[] arr,int k,List<List<Integer>> ans,List<Integer> ds){
       
        if(k==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
            
        
        for(int j=i;j<n;j++){
            if(j>i && arr[j]==arr[j-1]){continue;}
            if(k<arr[j]){break;}
            ds.add(arr[j]);
            find(j+1,n,arr,k-arr[j],ans,ds);
            ds.remove(ds.size()-1);
        }
       
    }
}