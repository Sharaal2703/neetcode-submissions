class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                int num2=st.pop();
                int num1=st.pop();
                int ans=0;
                switch(tokens[i])
                {
                    case "+":
                        ans=num1+num2;
                        break;
                    case "-":
                        ans=num1-num2;
                        break;
                    case "*":
                        ans=num1*num2;
                        break;
                    case "/":
                        ans=num1/num2;
                        break;

                }
                st.push(ans);
                continue;
            
            }
            else
            {
                int num=Integer.parseInt(tokens[i]);
                st.push(num);
            }
            
            
        }
        int ans=st.pop();
        return ans;
        
    }
}
