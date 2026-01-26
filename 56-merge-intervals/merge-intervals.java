class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length,a=0;
        int[][] ans=new int[n][2];
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        for (int i=0;i<n;i++){
            if(i==0){
                ans[a][0]=intervals[i][0];
                ans[a][1]=intervals[i][1];
                a++;
            }else if ((intervals[i][0]<=ans[a-1][1]&&intervals[i][0]>=ans[a-1][0])||(intervals[i][1]<=ans[a-1][1]&&intervals[i][1]>=ans[a-1][0])||(intervals[i][0]<ans[a-1][0]&&intervals[i][1]>ans[a-1][1] )){
                ans[a-1][0]=Math.min(intervals[i][0],ans[a-1][0]);
                ans[a-1][1]=Math.max(intervals[i][1],ans[a-1][1]);

            }else{
                ans[a][0]=intervals[i][0];
                ans[a][1]=intervals[i][1];
                a++;
            }
        }
        return Arrays.copyOf(ans, a) ;
    }
}