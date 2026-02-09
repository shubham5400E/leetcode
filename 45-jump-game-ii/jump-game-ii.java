class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int ptr=0 ,jmp=0,max=0;
        for (int i=0;i<n-1;i++){
            max=Math.max(max,i+nums[i]);
            if (i==ptr){
                jmp++;
                ptr=max;
            }
        }
        return  jmp;
    }
}