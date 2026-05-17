class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, HashMap<Character, Integer>> hash = new HashMap<>();
        Set<List<String>> result = new HashSet<>();
        List<String> special = new ArrayList<>();
        for (int i = 0 ; i < strs.length ; i++) {
            if (strs[i].equals("")) {
                special.add(strs[i]);
            }
            HashMap<Character, Integer> sub_hash = new HashMap<>();
            for (char c : strs[i].toCharArray()) {
                sub_hash.put(c, sub_hash.getOrDefault(c, 0) + 1);
            }
            hash.put(i, sub_hash);
        }
        for (int i = 0 ; i < strs.length ; i++) {
            if (strs[i].equals("")) {
                continue;
            }
            HashMap<Character, Integer> target = new HashMap<>();
            List<String> sub_result = new ArrayList<>();
            target = hash.get(i);
            for (Integer index : hash.keySet()) {
                if (hash.get(index).equals(target)){
                    sub_result.add(strs[index]);
                }
            }
            result.add(sub_result);
        }
        if (!special.isEmpty()) {
            result.add(special);
        }
        List<List<String>> listOfLists = new ArrayList<>(result);
        return listOfLists;
    }
}