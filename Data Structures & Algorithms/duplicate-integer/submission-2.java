class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> a=new ArrayList<>();
        for(int i:nums)
        {
            if(a.contains(i))
            {
                return true;
            }
            a.add(i);
        }
        return false;
        
    }
}