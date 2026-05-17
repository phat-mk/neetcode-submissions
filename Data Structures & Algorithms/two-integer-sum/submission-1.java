class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++) {
            hash.put(nums[i], i);
        }
        System.out.println(hash);
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            int difference = target - nums[i];
            if (hash.containsKey(difference) && hash.get(difference) != i) {
                result[0] = i;
                result[1] = hash.get(difference);
                return result;
            } else {
                continue;
            }
        }
        return result;
    }
}