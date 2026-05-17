class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int missing = 1;
        while (true) {
            boolean flag = true;
            for (int num:nums){
                if (missing == num) {
                    flag = false;
                    break;
                }
            }
            if (flag) return missing;
            missing++;
        }
    }
}