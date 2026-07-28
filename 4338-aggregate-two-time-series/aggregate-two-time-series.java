class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] nums1, int[][] nums2) {
        int n=nums1.length-1;
        int m=nums2.length-1;
        int i=0,j=0;
        List<List<Integer>> ans=new ArrayList<>();
        while(n>=0 && m>=0 ){
            List<Integer> ls=new ArrayList<>();
            if(nums1[n][0]==nums2[m][0]){
                ls.add(nums1[n][0]);
                ls.add(nums1[n][1]+nums2[m][1]);
                i=nums1[n][1];
                j=nums2[m][1];
                n--;
                m--;
            }else if(nums1[n][0]>nums2[m][0]){
                ls.add(nums1[n][0]);
                ls.add(nums1[n][1]+j);
                i=nums1[n][1];
                n--;  
            }else{
                ls.add(nums2[m][0]);
                ls.add(nums2[m][1]+i);
                j=nums2[m][1];
                m--; 
            }
            ans.add(new ArrayList<>(ls));
        }
        while(n>=0){
            List<Integer> ls=new ArrayList<>();
            ls.add(nums1[n][0]);
                ls.add(nums1[n][1]+j);
                i=nums1[n][1];
                ans.add(ls);
                n--;  
        }
        while(m>=0){
            List<Integer> ls=new ArrayList<>();
            ls.add(nums2[m][0]);
                ls.add(nums2[m][1]+i);
                j=nums2[m][1];
                ans.add(ls);
                m--;
        }

        Collections.reverse(ans);
        return ans;
    }
}