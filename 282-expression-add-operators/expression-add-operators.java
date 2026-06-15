class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans=new ArrayList<>();
        String ds="";
        find(0,0,0,num,target,ans,ds);
        return ans;
    }
    void find(int i,long sum,long prevSum,String str,int target,List<String> ans,String ds){
        if( i==str.length()){
            if(sum==target){
            ans.add(ds);
            }
            return;
        }
        for(int j=i;j<str.length();j++){
            if(j>i && str.charAt(i)=='0')return;

            String ch=str.substring(i,j+1);
            long c=Long.parseLong(ch);
            if(i==0){
                find(j+1,c,c,str,target,ans,ch);
            }else{
                find(j+1,sum+c,c,str,target,ans ,ds+"+"+ch);
                find(j+1,sum-c,-c,str,target,ans ,ds+"-"+ch);
                find(j+1,sum-prevSum+prevSum*c,prevSum*c,str,target,ans ,ds+"*"+ch);
            }

        }
        

    }
}