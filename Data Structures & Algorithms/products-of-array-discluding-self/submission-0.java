class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] subfix = new int[n];
        int[] result = new int[n];
        prefix[0] = 1;
        for (int i = 1;  i < n ; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        subfix[n-1] = 1;
        for (int i = n - 2 ; i >= 0; i--){
            subfix[i] = subfix[i+1] * nums[i+1];
        }
        for (int i = 0;  i < n ; i++) {
            result[i] = prefix[i] * subfix[i];
        }
        return result;
    }
} 