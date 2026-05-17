class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String str : strs) {
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int i: count) {
                stringBuilder.append('#');
                stringBuilder.append(i);
            }
            String key = stringBuilder.toString();
            hashMap.computeIfAbsent(key, list -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }
}