class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 1; i <= n; i++) {
            int theOne = target - numbers[i-1];
            for(int j = i + 1; j <= n; j++) {
                if(numbers[j-1] == theOne) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}