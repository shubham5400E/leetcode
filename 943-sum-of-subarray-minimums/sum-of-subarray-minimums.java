class Solution {
    public int sumSubarrayMins(int[] arr) {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st1=new Stack<>();

    int n=arr.length;
    int[] prev=new int[arr.length];
    int[] next=new int[arr.length];

    for(int i=0;i<n;i++){
        while(!st.isEmpty() && arr[st.peek()]>arr[i]){
            st.pop();
        }
        prev[i]=st.isEmpty() ? -1:st.peek();
        st.push(i);
    }
     for(int i=n-1;i>=0;i--){
        while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
            st1.pop();
        }
        next[i]=st1.isEmpty() ? n:st1.peek();
        st1.push(i);
    }
    long sum=0;
    long mod=1000000007;
    for(int i=0;i<n;i++){

      long left = i - prev[i];
            long right = next[i] - i;
            sum = (sum + (left * right % mod) * arr[i]) % mod;
            }
    return (int)sum;
    }
}