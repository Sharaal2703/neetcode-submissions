class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int prefix[]=new int[len];
        int post[]=new int[len];
        prefix[0]=1;
        post[len-1]=1;
        for(int i=1;i<len;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j=len-2;j>=0;j--)
        {
            post[j]=post[j+1]*nums[j+1];
        }
        for(int k=0;k<len;k++)
        {
            nums[k]=prefix[k]*post[k];
        }
        return nums;
        
    }
}  
