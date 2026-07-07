class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative=(dividend<0)^(divisor<0);
        long dvs=Math.abs((long)divisor);
        long dvd=Math.abs((long)dividend);
        int ans=0;
        while(dvd>=dvs){
        int shift=0;
        while(dvd>=(dvs<<shift+1))shift++;
        dvd-=(dvs<<shift);
        ans+=(1<<shift);
        }
        return isNegative? -ans:ans;
    }
}