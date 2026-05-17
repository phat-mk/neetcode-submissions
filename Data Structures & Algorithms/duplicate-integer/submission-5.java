class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashMap = new HashSet<>();
        for(int i : nums) {
            if(hashMap.contains(i)) {
                return true;
            }
            hashMap.add(i);
        }
        return false;
    }
}