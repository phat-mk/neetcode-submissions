class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = 0, left = 0, right = n - 1;
        while(left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = width * height;
            max = Math.max(max, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}