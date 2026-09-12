class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int cad=n;
        int i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int peek=0;
            while(i<n && ratings[i]>ratings[i-1]){
                peek++;
                cad+=peek;
                i++;
            }
            int down=0;
            while(i<n && ratings[i]<ratings[i-1]){
                down++;
                cad+=down;
                i++;
            }
            cad-=Math.min(peek,down);
        }
        return cad;
    }
}