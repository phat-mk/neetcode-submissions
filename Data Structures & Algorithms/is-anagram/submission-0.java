class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashmap_of_s = new HashMap<>();
        HashMap<Character, Integer> hashmap_of_t = new HashMap<>();
        for(char c : s.toCharArray()){
            hashmap_of_s.put(c, hashmap_of_s.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            hashmap_of_t.put(c, hashmap_of_t.getOrDefault(c, 0) + 1);
        }
        // System.out.println(hashmap_of_s);
        // System.out.println(hashmap_of_t);
        if (hashmap_of_s.equals(hashmap_of_t)){
            return true;
        }
        return false;
    }
}
