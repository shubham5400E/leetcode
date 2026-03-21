class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int ans=0;
        if(i+1==0){return 0;}
        while(i>0&&s.charAt(i)==' '){i--;}
        while(i>=0&&s.charAt(i)!=' '){
            ans++;
            i--;
        }
        return ans;
    }
}