class Solution {
    public String longestCommonPrefix(String[] strs) {
    String prefix=strs[0];
    for(int j=1;j<strs.length;j++){
        int i;
        int k=Math.min(strs[j].length(),prefix.length());
        for (i=0;i<k;i++){
            if(strs[j].charAt(i)!=prefix.charAt(i)){
                break;
            }
        }
        prefix=prefix.substring(0,i);

    }    
    return prefix;
    }
}