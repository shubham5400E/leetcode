class Solution {
    public int maxDepth(String s) {
        int temp=0,ans=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                temp++;
            }else if(s.charAt(i)==')'){
                temp--;
            }
            ans=Math.max(ans,temp);

        }
        return ans;
    }
}