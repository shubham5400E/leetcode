class Solution {
    public int uniqueXorTriplets(int[] nums) {
    int n=nums.length;
    if(n==1)return 1;
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            set.add(nums[i]^nums[j]);
        }
    } 
    HashSet<Integer> ans=new HashSet<>();

    for(int i:set){
        for(int j:nums){
            ans.add(i^j);
        }
    }
    return ans.size();
    }
}