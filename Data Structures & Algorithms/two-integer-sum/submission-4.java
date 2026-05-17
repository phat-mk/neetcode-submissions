class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int theOne = target - nums[i];
            if(hashMap.containsKey(theOne)) {
                result[0] = hashMap.get(theOne);
                result[1] = i;
            }
            hashMap.put(nums[i], i);
        }
        return result;
    }
}
