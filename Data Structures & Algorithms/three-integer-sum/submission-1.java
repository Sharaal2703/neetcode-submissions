class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if((nums[i]+nums[j]+nums[k])==0)
                    {
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        Collections.sort(li);
                        if(!ans.contains(li))
                            ans.add(li);
                    }
                }
            }

        }
        return ans;
        
    }
}
