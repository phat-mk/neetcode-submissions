class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : s.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        }
        for(char c : t.toCharArray()){
            if(!hashMap.containsKey(c)) {
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
            if(hashMap.get(c) == 0) {
                hashMap.remove(c);
            }
        }
        return hashMap.isEmpty();
    }
}