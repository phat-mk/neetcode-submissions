class Solution {
    public int trap(int[] height) {
        int result = 0, n = height.length;
        for(int i = 1; i < n - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            int maxLeft = height[left];
            int maxRight = height[right];
            while(left >= 0) {
                maxLeft = Math.max(maxLeft, height[left]);
                left--;
            }
            while (right < n) {
                maxRight = Math.max(maxRight, height[right]);
                right++;
            }
            System.out.println("left" + maxLeft);
            System.out.println("right" + maxRight);
            System.out.println(height[i]);
            int temp = Math.min(maxLeft, maxRight) - height[i];
            if(temp > 0) result += temp;
        }
        return result;
    }
}