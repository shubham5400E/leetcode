class Twitter {
    int time;
    Map<Integer,List<int[]>> t;
    Map<Integer,Set<Integer>> f;
    public Twitter() {
        t=new HashMap<>();
        f=new HashMap<>();
        time=0;
    }
    
    public void postTweet(int userId, int tweetId) {
        t.putIfAbsent(userId,new ArrayList<>());
        t.get(userId).add(new int[]{time++,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[0]-b[0]);
        if(t.containsKey(userId)){
            for(int[] a:t.get(userId)){
                pq.offer(a);
                if(pq.size()>10){
                    pq.poll();
                }
            }
        }
        if(f.containsKey(userId)){
            for(int i:f.get(userId)){
                if(t.containsKey(i)){
            for(int[] a:t.get(i)){
                pq.offer(a);
                if(pq.size()>10){
                    pq.poll();
                }
            }
        } 
            }
        }
        LinkedList<Integer> ls=new LinkedList<>();
        while(!pq.isEmpty()){
            ls.addFirst(pq.poll()[1]);
        }
        return ls;
        
    }
    
    public void follow(int followerId, int followeeId) {
        f.putIfAbsent(followerId,new HashSet<>());
        f.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(f.containsKey(followerId)){
            f.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */