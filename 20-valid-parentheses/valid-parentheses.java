class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(!st.isEmpty()){

                char temp=st.pop();
                if(!((temp=='(' && ')'==ch)|| (temp=='[' && ']'==ch)||(temp=='{' &&'}'==ch))){
                    return false;
                }
            }else{return false;}
        }

        return st.isEmpty();
    }
}