class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int n:nums){
            xor^=n;
        }

        int right=(xor&(xor-1))^xor;
        int a=0,b=0;
        for(int n:nums){
            if((n & right)!=0){
                a^=n;
            }
            else{b^=n;}

        } 
        int[] arr={a,b};
        return arr;
    }
}