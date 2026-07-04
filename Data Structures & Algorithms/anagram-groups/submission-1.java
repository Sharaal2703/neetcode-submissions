class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m=new HashMap<>();
        for(String i:strs)
        {
            char ch[]=i.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!m.containsKey(sorted))
            {
                m.put(sorted,new ArrayList<>());
            }
            m.get(sorted).add(i);


        }
        List<List<String>> ans=new ArrayList<>(m.values());
        return ans;
        
    }
}
