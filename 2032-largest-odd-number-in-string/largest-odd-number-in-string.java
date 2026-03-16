class Solution {
    public String largestOddNumber(String num) {
     int n=num.length();
     String ans="";
     for(int i=n-1;i>=0;i--){
        int temp=(int)num.charAt(i);
        if(temp%2==1){
            return num.substring(0,i+1);
        }
     }   
     return ans;
    }
}