class Solution {

    public String encode(List<String> strs) {
        StringBuilder answer=new StringBuilder();
        for(String i:strs)
        {
            int len=i.length();
            answer=answer.append(len+"#"+i);
        }
        return answer.toString();

    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;

            }
            int start=j+1;
            String num=str.substring(i,j);
            int end=Integer.parseInt(num);
            String s=new String();
            s=""+str.substring(start,start+end);
            ans.add(s);
            i=start+end;
        }
        return ans;

    }
}
