class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> ms=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(ms.isEmpty())
        {
            ms.push(val);
        }
        else if(ms.peek()>=val)
        {
            ms.push(val);
        }
        
    }
    
    public void pop() {
        int ans=st.pop();
        if(!ms.isEmpty() && ms.peek()==ans)
        {
            ms.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        if(!ms.isEmpty())
        {
            return ms.peek();
        }
        return -1;
        
    }
}
