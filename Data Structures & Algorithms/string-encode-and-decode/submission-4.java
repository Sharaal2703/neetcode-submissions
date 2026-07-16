class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String i:strs)
        {
            int len=i.length();
            s.append(len+"#"+i);

        }
        return s.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<str.length())
        {
            j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int start=j+1;
            String num=str.substring(i,j);
            int end=Integer.parseInt(num);
            String s=str.substring(start,start+end);
            ans.add(s);
            i=start+end;

        }
        return ans;

    }
}
