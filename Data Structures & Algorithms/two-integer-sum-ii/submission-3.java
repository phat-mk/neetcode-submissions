class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            int theOne = target - numbers[i-1];
            if (hashMap.containsKey(theOne)) {
                int index1 = hashMap.get(theOne);
                return new int[]{index1, i};
            }
            hashMap.put(numbers[i-1], i);
        }
        return new int[]{0, 0};
    }
}