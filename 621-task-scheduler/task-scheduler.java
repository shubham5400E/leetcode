class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map=new  HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int v:map.values()){
            pq.add(v);
        }
        int time =0;
        while(!pq.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            int c=n+1;
            int i=0;
            while(i<c && !pq.isEmpty()){
                int temp=pq.poll();
                temp--;
                if(temp>0){
                    ls.add(temp);
                }
                time++;
                i++;
            }
            for(int l:ls){
                pq.add(l);
            }
            if(!pq.isEmpty()){
                time+=c-i;
            }
        }
        return time;
    }
}