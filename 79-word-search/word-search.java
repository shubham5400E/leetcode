class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(find(i,j,0,board,word,board.length,board[0].length)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean find(int i,int j,int k,char[][] board, String word,int m,int n){
        if(k==word.length()){
        return true;}
        if(i<0||j<0||i>=m||j>=n||board[i][j]!=word.charAt(k)){return false;}

       
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = find(i+1,j,k+1,board,word,m,n) ||
                        find(i-1,j,k+1,board,word,m,n) ||
                        find(i,j+1,k+1,board,word,m,n) ||
                       find(i,j-1,k+1,board,word,m,n);

        board[i][j] = temp;

        return found;
    }}