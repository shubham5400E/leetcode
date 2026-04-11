class Solution {
    void back(String str,int open,int close,int n,List<String> ls){
        if(str.length()==n*2){
            ls.add(str);
            return;
        }
        if(open<n){
            back(str+"(",open+1,close,n,ls);
        }
        if(close<open){
            back(str+")",open,close+1,n,ls);
        }

    }
    public List<String> generateParenthesis(int n) {
    List<String> ls=new ArrayList<>();
    back("",0,0,n,ls);
    return ls;     
    }
}