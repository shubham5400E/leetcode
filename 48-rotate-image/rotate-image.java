class Solution {
    public void rotate(int[][] matrix) {
         int row=matrix.length;
        int column=matrix[0].length;
    
        for (int i=0;i<row/2;i++){
            for (int j=i;j<column-1-i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[row-1-j][i];
                matrix[row-1-j][i]=matrix[row-1-i][column-1-j];
                matrix[row-1-i][column-1-j]=matrix[j][column-1-i];
                matrix[j][column-1-i]=temp;

            }
        }
       
    }
}