class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int rev=0;
        int temp;
        while(y>0){
            temp=y%10;
            rev=rev*10+temp;
            y=y/10;
        }
        if(x==rev){
            return true;
        }
        else 
        return false;
    }
}