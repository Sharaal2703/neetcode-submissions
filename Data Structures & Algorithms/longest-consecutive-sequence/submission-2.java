class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int longest=0;
        int lastVal=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastVal)
            {
                count++;
                lastVal=nums[i];
            }
            else if(nums[i]!=lastVal)
            {
                count=1;
                lastVal=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
        
    }
}
