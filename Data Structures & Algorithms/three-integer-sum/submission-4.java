class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int l = j + 1; l < n; l++) {
                    if(nums[i] + nums[j] + nums[l] == 0) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[l]);
                        result.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}