class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hash = new HashMap<>();
        int result = 0;
        for (int i : nums) {
            hash.put(i, true);
        }
        for (int i : nums) {
            if (hash.get(i-1) == null) {
                int temp_result = 1;
                while (hash.get(i + 1) != null) {
                    temp_result++;
                    i++;
                }
                if (result < temp_result) {
                    result = temp_result;
                }
            }
        }
        return result;
    }
} 