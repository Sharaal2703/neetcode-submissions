class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2)
        {
            return false;
        }
        int freqArr[]=new int[26];
        for(int i=0;i<len1;i++)
        {
            freqArr[s.charAt(i)-'a']=freqArr[s.charAt(i)-'a']+1;
            freqArr[t.charAt(i)-'a']=freqArr[t.charAt(i)-'a']-1;

        }
        for(int i:freqArr)
        {
            if(i!=0)
            {
                return false;
            }

        }
        return true;

    }
}
