class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans =new ArrayList<>();
        char[][] b=new char[n][n];
        int[] row=new int[n];
        int[] lower=new int[2*n-1];
        int[] upper=new int[2*n-1]; 
        for(char[] r:b){
           Arrays.fill(r,'.');
        }
        find(0,ans,b,row,lower,upper,n);
        return ans;
    }
    void find(int column,List<List<String>> ans,char[][] b,int[] row,int[] lower,int[] upper,int n){
        if(column==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(b[i]) );
            }
            ans.add(temp);
        }

        for(int i=0;i<n;i++){
            if(row[i]==0 && lower[i+column]==0&& upper[n-1+column-i]==0){
                b[i][column]='Q';
                row[i]=1 ;
                lower[i+column]=1;
                upper[n-1+column-i]=1;
                find(column+1,ans,b,row,lower,upper,n);
                b[i][column]='.';
                row[i]=0 ;
                lower[i+column]=0;
                upper[n-1+column-i]=0;
            }
        }
        
    }
}