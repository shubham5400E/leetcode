class Solution {
    public void sortColors(int[] nums) {
    int n=nums.length,a=0,b=0,c=0;
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            a++;
        }
        else if(nums[i]==1){
            b++;
        }
        else{
            c++;
        }
    }
    for(int i=0;i<n;i++){
        if(a>0){
            nums[i]=0;
            a--;
        }
        else if(b>0){
            nums[i]=1;
            b--;
        }
        else if(c>0){
            nums[i]=2;
            c--;
        }
    }
    
    }
}