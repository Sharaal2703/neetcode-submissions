class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int maxfreq=0;
        int window_size=0;
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            window_size=right-left+1;
            if(window_size-maxfreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            window_size=right-left+1;
            ans=Math.max(ans,window_size);
        }
        return ans;
        
    }
}
