class Solution {
    public int minBitFlips(int start, int goal) {
        int c=0;
        while(start>0 || goal >0){
            if(start%2!=goal%2){
                c++;
            }
            start/=2;
            goal/=2;
        }
    return c;
    }

}