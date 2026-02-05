class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int l=0,r=n-1;
        while(l<r){

            int min=Math.min(height[l],height[r]);
            max=Math.max(max,(r-l)*min);
            if(min==height[l]){
                l++;
            }else{
                r--;
            }
            
        }
        return max;
    }
}