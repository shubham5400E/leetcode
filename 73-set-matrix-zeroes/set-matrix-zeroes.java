class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        boolean[] c=new boolean[column];
        boolean[] r=new boolean[row];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if(c[j]==true || r[i]==true){
                                        matrix[i][j] = 0;

                         }
            }
        }
    }
}