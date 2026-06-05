class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans =new ArrayList<>();
        Map<Character ,String> data =new HashMap<>();
        data .put('2',"abc");
        data.put('3',"def");
        data.put('4',"ghi");
        data.put('5',"jkl");
        data.put('6',"mno");
        data.put('7',"pqrs");
        data.put('8',"tuv");
        data.put('9',"wxyz");
        find(0,data,digits,ans,"");
        return ans;    
    }
    void find(int i,Map<Character,String> data,String digit,List<String> ans,String ds){
        if(i==digit.length()){
            ans.add(ds);
            return;
        }
        String str=data.get(digit.charAt(i));
        for(int j=0;j<str.length();j++){
            String temp=ds;
            ds=ds+str.charAt(j);
            find(i+1,data,digit,ans,ds);
            ds=temp;
        }
    }
}