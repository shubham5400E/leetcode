class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int storage=0,l_max=0,r_max=0;
        while (left<right){
            if(height[left]<=height[right]){
                if(l_max<=height[left]){
                    l_max=height[left];
                }else{
                    storage+=l_max-height[left];
                }
                left++;
            }else{
                if (height[right]>=r_max){
                    r_max=height[right];
                }else{
                    storage+=r_max-height[right];
                }
                right--;
            }
        }
        return storage;
    }
}