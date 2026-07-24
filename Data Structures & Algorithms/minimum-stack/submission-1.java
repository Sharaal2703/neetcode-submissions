class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mini;

    public MinStack() {
        stack=new Stack<>();
        mini=new Stack<>();
        
    }
    
    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(val);
            mini.push(val);
            return;
        }
        stack.push(val);
        if(val<=mini.peek())
        {
            mini.push(val);
        }
        
    }
    
    public void pop() {
        int ele=stack.pop();
        if(ele==mini.peek())
        {
            mini.pop();
        }
        
    }
    
    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
        return stack.peek();
        
    }
    
    public int getMin() {
        if(mini.isEmpty())
        {
            return -1;
        }
        return mini.peek();
        
    }
}
