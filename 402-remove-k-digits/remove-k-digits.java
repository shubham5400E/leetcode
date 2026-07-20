class Solution {
    public String removeKdigits(String num, int k) {
    Stack<Character> st=new Stack<>();
    int n=num.length();
    int t=k;
    for(int i=0;i<n;i++){
        char cur=num.charAt(i);
        while(!st.isEmpty() && st.peek()>cur && t>0){
            st.pop();
            t--;
        }
        st.push(cur);
    }
    while(t>0){
        t--;
        st.pop();
    }
    if(st.isEmpty()){
        return "0";
    }

    int s=st.size();   
    String ans=""; 
    for(int i=0;i<s;i++){
        ans=st.pop()+ans;
    }
    int j=0;
    while(ans.length()>j && ans.charAt(j)=='0'){
        j++;
    }
    ans=ans.substring(j);
    if(ans.length()==0)return "0";
    return ans;
    

    }
}