class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length,a=0;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(a==0){
                ans[0]=i;
                ans[1]=i;
                a++;
                }else {
                    ans[1]=i;
                }
            }
        }
        if(a==0){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        return ans;
    }
}