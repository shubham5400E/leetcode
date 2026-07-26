class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);
       return Math.max(nums[n]*nums[n-1]*nums[n-2],nums[n]*nums[1]*nums[0]);
    }
}