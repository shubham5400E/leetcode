class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int flag=0,i=0;
        for (char ch:s.toCharArray()){
            if(ch=='('){i++;}
            else{i--;}
            if(i>0 && flag==1){
                ans+=ch;
            }else if(i==0 && flag==1){
                flag=0;
            }
            else{
                flag=1;
            }
        }
        return ans;
    }
}