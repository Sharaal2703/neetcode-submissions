class Solution {
    int idxSrch(int arr[],int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        HashSet<Integer>set=new HashSet<>();
        int num1=0;
        int num2=0;
        for(int i=0;i<numbers.length;i++)
        {
            int srch=target-numbers[i];
            if(set.contains(srch))
            {
                num2=numbers[i];
                num1=srch;
                break;
            }
            set.add(numbers[i]);
        }
        int arr[]=new int[2];
        int idx1=idxSrch(numbers,num1);
        int idx2=idxSrch(numbers,num2);
        arr[0]=idx1+1;
        arr[1]=idx2+1;
        return arr;


        
    }
}
