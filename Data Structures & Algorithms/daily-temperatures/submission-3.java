class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=st.peek()-i;
            }
            st.push(i);

        }
        return arr;
        // Stack<Integer> st=new Stack<>();
        // int n=temperatures.length-1;
        // int ans[]=new int[n+1];
        // for(int i=n;i>=0;i--)
        // {
        //     while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
        //     {
        //         st.pop();
        //     }
        //     if(st.isEmpty())
        //     {
        //         ans[i]=0;
        //     }
        //     else
        //     {
        //         ans[i]=st.peek()-i;
        //     }
        //     st.push(i);
        // }
        // return ans;
    }
}
