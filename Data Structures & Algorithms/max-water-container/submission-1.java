class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int breadth=Integer.MAX_VALUE;
        int maxArea=Integer.MIN_VALUE;
        while(i<j)
        {
            int length=j-i;
            breadth=Math.min(height[i],height[j]);
            int area =length*breadth;
            maxArea=Math.max(maxArea,area);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        return maxArea;
        
    }
}
