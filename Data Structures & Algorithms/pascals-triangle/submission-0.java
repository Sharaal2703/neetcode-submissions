class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer> r=li.get(i-1);
                    int sum=r.get(j)+r.get(j-1);
                    row.add(sum);
                }

            }
            li.add(row);
        }
        return li;
        
    }
}