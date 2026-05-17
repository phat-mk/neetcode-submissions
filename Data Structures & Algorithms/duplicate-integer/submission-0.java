class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> list_set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            list_set.add(nums[i]);
        }
        if (nums.length == list_set.size()) {
            return false;
        }
        return true;
    }
}