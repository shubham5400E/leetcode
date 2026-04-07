class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even =(n+1)/2;
        long odd=(n)/2;
        long ans =(pow(4,odd)%MOD*pow(5,even)%MOD)%MOD;
        return (int)ans;

    }long  pow(long x,long n){
        if(n==0){return 1;}
        if(n==1){return x;}
        if(n%2==0){return pow(x%MOD*x%MOD,n/2)%MOD;}
        return x*pow(x,n-1)%MOD;
    }
}