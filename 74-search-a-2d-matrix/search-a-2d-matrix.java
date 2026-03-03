class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int low=0,high=m*n-1;
        while(low<=high){
            int mid=(low+high)/2;
            
            int r=0,c=0;
            c=mid;
            while(mid>n-1){
                r++;
                mid-=n;
            }
            if(matrix[r][mid]==target){
                return true;
            }
            else if(matrix[r][mid]>target){
                high=c-1;
            }
            else{
                low=c+1;
            }
        }
        return false;

    }
}