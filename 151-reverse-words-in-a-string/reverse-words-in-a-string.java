class Solution {
    public String reverseWords(String s) {
       String ans="",temp="";
       s = s.trim();
       for (char ch:s.toCharArray()){
        if (ch!=' '){
            temp+=ch;
        }
        else if(temp!="" ){
            ans=temp+" "+ans;
            temp="";
        }
       }
       ans=temp+" "+ans;
       
       return ans.trim();
    }
}