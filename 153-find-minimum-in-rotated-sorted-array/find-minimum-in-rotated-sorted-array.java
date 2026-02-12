class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1,max=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                max=Math.min(max,nums[low]);
                low=mid+1;
            }else
            {
                max=Math.min(max,nums[mid]);
                high=mid-1;
            }
        }
        return max;
    }
}