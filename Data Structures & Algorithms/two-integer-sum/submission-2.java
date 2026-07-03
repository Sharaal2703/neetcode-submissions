class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=target-nums[i];
            if(l.containsKey(a))
            {
                arr[0]=l.get(a);
                arr[1]=i;

            }
            l.put(nums[i],i);
        }
        return arr;
        
        
    }
}
