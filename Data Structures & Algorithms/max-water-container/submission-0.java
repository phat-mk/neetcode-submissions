class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int len = heights.length;
        int start = 0, end = len - 1;
        while (start < end) {
            int temp_max = Math.min(heights[start], heights[end]) * (end - start);
            if (temp_max > max) max = temp_max;
            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}