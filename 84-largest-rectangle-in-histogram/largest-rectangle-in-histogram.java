class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
    for(int i=0;i<n;i++){
        while(!st.isEmpty() && heights[st.peek()]>heights[i]){
            int temp=st.pop();
            int nse=i;
            int pse=st.isEmpty()?-1:st.peek();
            max=Math.max(max,heights[temp]*(nse-pse-1));
        }
        st.push(i);
    }    
    while(!st.isEmpty()){
        int nse=n;
        int temp=st.pop();
        int pse=st.isEmpty()?-1:st.peek();
        max=Math.max(max,heights[temp]*(nse-pse-1));
    }
    return max;
    }
}