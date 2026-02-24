class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1,high=Arrays.stream(piles).max().getAsInt();
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            long total=count(piles,mid);
            if(total<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    long count(int[] piles,int mid){
        long total=0;
        for(int p:piles){
            total+=(p + mid - 1) / mid;
        }
        return total;
    }
}