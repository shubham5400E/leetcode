class Solution {
    public int myAtoi(String s) {
        int i=0;
        String ans="";
        while(s.length()>i&&s.charAt(i)==' '){i++;}
        if(s.length()>i&&s.charAt(i)=='-'){
                ans="-"+ans;
                i++;
            }else if(i<s.length() && s.charAt(i) == '+') {
            i++;
        }
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch!=0 && Character.isDigit(ch)){
                ans=ans+ch;
            }else{break;}
            i++;
        }

        if(ans==""|| ans.equals("-")){
            return 0;
        }
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            if (ans.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }    }
}