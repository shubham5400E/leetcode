class Solution {
    public int largestInteger(int n, int sum) {
        int ans=0;
        while(n>0){
            if(sum>=9){
                sum-=9;
                ans=(ans*10)+9;
            }else if(sum>0){
                ans=(ans*10)+sum;
                sum-=sum;
            }
            else{
                ans*=10;
            }
            n--;
        }
        if(sum>0){
            return -1;
        }
        return ans;
    }
}