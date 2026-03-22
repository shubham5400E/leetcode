class Solution {
    public String longestPalindrome(String s) {
    int start=0,end=0;
    for (int i=0;i<s.length();i++)    {
        int len1=extend(s,i,i);
        int len2=extend(s,i,i+1);
        int max=Math.max(len1,len2);
        if(max>end-start){
            start=i-(max-1)/2;
            end=i+max/2;
        }
    }
    return s.substring(start,end+1);
    }
    int extend(String s,int l,int r){
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            r++;
            l--;
        }
        return r-l-1;
    }
    
}