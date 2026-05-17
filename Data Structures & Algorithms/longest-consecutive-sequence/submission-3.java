class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        int result = 0;
        for(int num: nums) {
            hashMap.put(num, true);
        }

        for(int num: nums) {
            if(hashMap.get(num - 1) == null) {
                int tempResult = 1;
                int i = num;
                while (hashMap.get(i + 1) != null){
                    tempResult++;
                    i++;
                }
                result = Math.max(result, tempResult);
            }
        }
        return result;
    }
}