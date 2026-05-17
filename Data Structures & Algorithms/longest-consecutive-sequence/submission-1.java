class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            set.add(i);
        }

        int result = 0;

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int current = i;
                int temp_result = 1;
                while (set.contains(current + 1)) {
                    temp_result++;
                    current++;
                }
                result = Math.max(result, temp_result);
            }
        }
        return result;
    }
} 