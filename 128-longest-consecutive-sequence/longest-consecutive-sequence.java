class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length==0){
            return 0;
        }
        int n=nums.length,max=1,a=1,prev=nums[0];
       
        for(int i=1;i<n;i++){
            if (nums[i]==prev+1){
                max++;
            }
            else if(nums[i]==prev){
                a=Math.max(max,a);
                            prev=nums[i];
                            continue;
            }
            else{
                max=1;
            }a=Math.max(max,a);
                            prev=nums[i];


        }
        return a;
    }
}