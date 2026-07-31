class Solution {
    public int minimumCost(int[] nums, int k) {

        int n=nums.length;
        long curr=k;
        long inc=0;
        long ans=0;
        for(int i=0 ;i<n;i++){
            if(curr<nums[i]){
                long temp=nums[i]-curr;
                if(temp%k==0){
                    inc+=temp/k;
                    curr+=k*(temp/k);
                }else{
                    inc+=(temp/k)+1;
                    curr+=k*((temp/k)+1);
                }
            }
            curr-=nums[i];
        }
        long MOD = 1_000_000_007L;
        long a = inc;
        long b = inc+1;
        if ((a%2) == 0) a /= 2;
        else b /= 2;
        return (int) ((a % MOD) * (b % MOD) % MOD);
    }
}