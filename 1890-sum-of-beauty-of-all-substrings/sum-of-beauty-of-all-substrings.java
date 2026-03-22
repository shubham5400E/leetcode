class Solution {
    public int beautySum(String s) {
    Map<Character,Integer> map=new HashMap<>();
    int sum=0;
    for(int j=0;j<s.length();j++){
    for(int i=j;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int val:map.values()){
        max=Math.max(max,val);
        min=Math.min(min,val);
        }
        sum+=max-min;
    }
    map.clear();
    
    }
    return sum;
    }
}