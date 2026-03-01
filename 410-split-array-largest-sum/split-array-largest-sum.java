class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (check(nums,mid,k)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean check(int[] nums,int mid,int k){
        int b=1,a=0;
        for(int i=0;i<nums.length;i++){
            if(a+nums[i]>mid){
                a=nums[i];
                b++;
            }else{
                a+=nums[i];
            }
        }
        return b<=k;
    } 
}