class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int prefix[]=new int[n];
        int postfix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        postfix[n-1]=1;
        for(int j=n-2;j>=0;j--)
        {
            postfix[j]=postfix[j+1]*nums[j+1];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=prefix[i]*postfix[i];
        }
        return arr;
        
    }
}  
