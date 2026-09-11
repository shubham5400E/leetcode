class Solution {
    public int maxDigitRange(int[] nums) {
        int high=0;
        int sum=0;
        for(int i:nums){
            int j=i;
            int l=Integer.MIN_VALUE,s=Integer.MAX_VALUE;
            while(i>0){
                int digit=i%10;
                if(digit<s)s=digit;
                if(digit>l)l=digit;
                i=i/10;
            }
            System.out.print(l);
            if((l-s)>high){
                high=l-s;
                sum=j;
            }else if(l-s==high){
                sum+=j;
            }
        }
        return sum;
    }
}