class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freMap = new HashMap<>();
        for (int i : nums) {
            freMap.put(i, freMap.getOrDefault(i, 0) + 1);
        }
        System.out.println(freMap);
        List<Set<Integer>> bucket = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new HashSet<>());   // fill every index with an empty list
        }
        for (int key : freMap.keySet()) {
            int frequent_value = freMap.get(key);
            bucket.get(frequent_value).add(key);
        }

        List<Integer> sub_result = new ArrayList<>();
        for (int i = nums.length ; i >= 0; i--) {
            if (bucket.get(i).size() != 0) {
                for(int ele : bucket.get(i)) {
                    if (sub_result.size() == k) {
                        break;
                    } else {
                        sub_result.add(ele);
                    }
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < sub_result.size(); i++) {
            result[i] = sub_result.get(i);
        }

        return result;
    }
}