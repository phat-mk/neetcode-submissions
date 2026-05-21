class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0, n = heights.length;
        for(int i = 0; i < n ; i++){
            int height = heights[i];
            int left = i, right = i;
            while(left - 1 >= 0 && heights[left - 1] >= heights[i]) {
                left--;
            }
            while(right + 1 < n && heights[right + 1] >= heights[i]) {
                right++;
            }
            int area = height * (right - left + 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}