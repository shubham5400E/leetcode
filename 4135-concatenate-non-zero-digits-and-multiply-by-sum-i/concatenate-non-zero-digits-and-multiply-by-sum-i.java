class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;String temp="";
        while(n>0){
            int digit=n%10;
            if(digit!=0){
            temp=Integer.toString(digit)+temp;
            sum+=digit;
            }
            n/=10;
        }
        if(temp==""){return 0;}
        return (long)sum*(Long.parseLong(temp));
    }
}