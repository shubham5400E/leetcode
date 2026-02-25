class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n=nums.length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int nu:nums){
            min=Math.min(min,nu);
            max=Math.max(max,nu);
        }
        int low=1,high=max,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(nums,threshold,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean check(int[] nums,int threshold,int mid){
        int ans=0;
        for (int n :nums){
            ans+=Math.ceil((double)n/mid);

        }
        return threshold >=ans;
    }
}