class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0, n = heights.length;
        for(int i = 0; i < n ; i++){
            int height = heights[i];
            int maxLeft = i, maxRight = i;
            // i = 3;
            // left = 2
            // right = 4
            int left = i - 1, right = i + 1;
            while(left >= 0) {
                if(heights[left] >= heights[i]) {
                    maxLeft = left;
                    left--;
                } else {
                    break;
                }
            }
            while(right < n) {
                if(heights[right] >= heights[i]) {
                    maxRight = right;
                    right++;
                } else {
                    break;
                }
            }
            int width = maxRight - maxLeft + 1;
            // System.out.println("index"+i);
            // System.out.println("width"+width);
            // System.out.println("height"+height);
            int area = height * width;
            System.out.println(area);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}