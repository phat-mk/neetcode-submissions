class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> result = new HashSet<>();
        int nums_len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i< nums_len-2; i++) {
            int first_ele = nums[i];
            int second_index = i + 1, third_index = nums_len - 1;
            while (second_index < third_index) {
                int pair_target = nums[second_index] + nums[third_index];
                if (pair_target == -first_ele) {
                    result.add(new ArrayList<>(Arrays.asList(first_ele, nums[second_index], nums[third_index])));
                    second_index++;
                } else if (pair_target > -first_ele){
                    third_index--;
                } else {
                    second_index++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}