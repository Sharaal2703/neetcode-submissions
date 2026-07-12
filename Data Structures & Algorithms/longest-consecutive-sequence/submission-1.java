class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int currCount=1;
        int longest=0;
        int lastVal=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==lastVal)
            {
                currCount++;
                lastVal=nums[i];
            }
            else if(nums[i]!=lastVal)
            {
                currCount=1;
                lastVal=nums[i];
            }
            longest=Math.max(currCount,longest);
        }
        return longest;
        
    }
}
