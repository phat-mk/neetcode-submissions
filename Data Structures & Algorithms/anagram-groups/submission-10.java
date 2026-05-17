class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder string_builder = new StringBuilder();
            for (int i : count) {
                string_builder.append("#");
                string_builder.append(i);
            }
            String key = string_builder.toString();
            hash.computeIfAbsent(key, list -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(hash.values());
    }
}