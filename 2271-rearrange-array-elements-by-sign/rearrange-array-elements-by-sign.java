class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length,positive=0,negative=1;
        int[] res=new int[n];
       for (int i =0;i<n;i++){
        if (nums[i]>=0){
            res[positive]=nums[i];
            positive+=2;
        } else if (nums[i]<0){
            res[negative]=nums[i];
            negative+=2;
        }
       }
      
       return res; 
    }
}