class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int low=0,high=m-1;
        while (low<=high){
            int mid=(low+high)/2;
            int max=find(mat,n,m,mid);
            int left=mid-1>=0?mat[max][mid-1]:-1;
            int right=mid+1<m?mat[max][mid+1]:-1;
            if (mat[max][mid]>left && mat[max][mid]>right){
                return new int[]{max, mid};
            }else if(mat[max][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    int find(int[][] mat,int n,int m,int mid){
        int ind=0;
        for (int i=1;i<n;i++){
            if(mat[ind][mid]<mat[i][mid]){
                ind=i;
            }

        }
        return ind;
    }
}