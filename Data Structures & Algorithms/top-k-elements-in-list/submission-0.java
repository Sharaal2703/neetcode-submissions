class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
        }
        List<Map.Entry<Integer,Integer>> li=new ArrayList<>(map.entrySet());
        Collections.sort(li,(a,b)->b.getValue()-a.getValue());
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=li.get(i).getKey();

        }
        return ans;
        
    }
}
