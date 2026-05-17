class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckerSort = new ArrayList[nums.length + 1];
        for(int num: hashMap.keySet()) {
            int freq = hashMap.get(num);
            if (buckerSort[freq] == null) buckerSort[freq] = new ArrayList<>();
            buckerSort[freq].add(num);
        }

        List<Integer> tempResult = new ArrayList<>();
        for(int i = buckerSort.length - 1; i >= 0 && tempResult.size() <= k; i--){
            if(buckerSort[i] != null) {
                tempResult.addAll(buckerSort[i]);
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }
}