class Solution {
    public int maximalRectangle(char[][] matrix) {
       int n=matrix[0].length;
       if(n==0) return 0;
       int[] height=new int[n];
       int max=0;
       for(char[] row:matrix){
           for(int i=0;i<n;i++){
            if(row[i]=='1') height[i]++;
            else{height[i]=0;}

           }
           max=Math.max(max,find(height)); 
       } 
       return max;
    }
    int find(int[] heigh){
        Stack<Integer> st=new Stack<>();
        int max=0;
        int[] height = Arrays.copyOf(heigh, heigh.length + 1);

        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]>height[i]){
                int temp=st.pop();
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                int h=nse-pse-1;
                max=Math.max(max,height[temp]*h);
            }
            st.push(i);
        }
        return max;
    }
}