class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int max = nums[0];
        int tempMax = nums[0];

        for (int i = 1; i < nums.length; i++){
            tempMax = Math.max(nums[i], tempMax + nums[i]);
            max = Math.max(tempMax, max);
        }
        return max;
    }
}