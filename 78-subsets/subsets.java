class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        find(0,ans,nums ,new ArrayList<>());
        return ans ;
    }
    void find(int i,List<List<Integer>> ans,int[] nums ,List<Integer> ds){
        if (i == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        find(i+1,ans,nums,ds);
        ds.remove(ds.size()-1);
        find(i+1,ans,nums,ds);

    }
}