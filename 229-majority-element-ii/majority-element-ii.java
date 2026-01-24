class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int a=nums.length/3;
        for(Map.Entry<Integer,Integer> val:map.entrySet()){
            int v=val.getValue();
            int k=val.getKey();
            if (v>a){
                ls.add(k);
            }
        }
        return ls;
    }
}