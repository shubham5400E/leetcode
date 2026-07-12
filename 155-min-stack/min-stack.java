class MinStack {

    Stack<Long> st;
    long min=0;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push((long)value);
            min=value;
            return;
        }else if(value>min){
        st.push((long)value);
        }
        else{
            st.push((long)2*value-min);
            min=value;
        }
    }
    
    public void pop() {
        if(st.isEmpty()){return;}
        long temp=st.pop();
        if(temp<min){
            min=2*min-temp;
        }
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        long t=st.peek();
        if(t<min)return (int)min;
        return (int)t;
    }
    
    public int getMin() {
        if(st.isEmpty())return -1;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */