class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0;
        
        int len=nums1.length+nums2.length;
        int arr[]=new int[len];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        if(len%2==0)
        {
            ans=(arr[len/2]+arr[(len/2)-1]);
            return ans/2;
        }
        return arr[len/2];
        
        
    }
}
