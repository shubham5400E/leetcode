class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int[] ans =new int[nums.length];
    Stack<Integer> st =new Stack<>();
    Arrays.fill(ans,-1);
    for (int i=0 ;i<nums.length*2;i++){
        int curr =nums[i%nums.length];
        while(!st.isEmpty() && nums[st.peek()]<curr){
            ans[st.pop()]=curr;
        }
        if(i<nums.length){
            st.push(i);
        }

    }   
    return ans; 
    }
}