class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int b:bloomDay){
            min=Math.min(min,b);
            max=Math.max(max,b);
        }
        int low=1,high=max,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
 
    }
    boolean check(int[] bloomDay,int day,int m,int k){
        int count=0,ans =0;
        for (int b:bloomDay){
            if (b<=day){
                count++;
                if(count>=k){
                    count=0;
                    ans++;
                }
            }else{
                count=0;
            }
        }
        return ans>=m;

    }
}