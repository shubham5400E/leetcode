class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        find(0,nums,ans,new ArrayList<>());
        return ans;
    }
    void find(int i,int[] nums,List<List<Integer>> ans ,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int j=i;j<nums.length;j++){
            if(j>i&& nums[j-1]==nums[j])continue;
            ds.add(nums[j]);
            find(j+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}