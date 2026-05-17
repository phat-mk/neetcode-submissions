class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int target = -1 * nums[i];
            HashMap<Integer, Boolean> hashMap = new HashMap<>();
            for(int j = i + 1; j < n; j++) {
                int finding = target - nums[j];
                if(hashMap.containsKey(finding)) {
                    hashMap.remove(finding);
                    List<Integer> tmp = Arrays.asList(nums[i], finding, nums[j]);
                    result.add(tmp);
                }
                hashMap.put(nums[j], true);
            }
        }
        return new ArrayList<>(result);
    }
}