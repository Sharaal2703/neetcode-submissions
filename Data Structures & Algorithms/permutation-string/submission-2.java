class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int right=0;
        int left=0;
        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> have=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(!need.containsKey(s1.charAt(i)))
            {
                need.put(s1.charAt(i),0);
                
            }
            need.put(s1.charAt(i),need.get(s1.charAt(i))+1);
        }
        while(right<s2.length())
        {
            char ch=s2.charAt(right);
            if(!need.containsKey(ch))
            {
                right++;
                left=right;
                have.clear();
                continue;
            }
            if(!have.containsKey(ch))
            {
                have.put(ch,0);
            }
            have.put(ch,have.get(ch)+1);
            while(have.get(ch)>need.get(ch))
            {
                char c=s2.charAt(left);
                have.put(c,have.get(c)-1);
                left++;
            }
            int size=right-left+1;
            if(size==s1.length()) return true;
            right++;
        }
        return false;
        
    }
}
