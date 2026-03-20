class Solution {
    public String frequencySort(String s) {
    Map<Character ,Integer> map=new HashMap<>();
    for(int i =0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    String ans="";
    List<Character> ls=new ArrayList(map.keySet());
    Collections.sort(ls,(a,b)->map.get(b)-map.get(a));
    for (char ch:ls){
        for(int i=0;i<map.get(ch);i++){
            ans=ans+ch;
        }
    }
    return ans;        
    }
}