class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for(char c : s1.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        for(int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
            if(right - left + 1 > s1.length()) {
                char remove = s2.charAt(left);
                hashMap2.computeIfPresent(remove, (k, v) -> v == 1 ? null : v - 1);
                left++;
            }
            if(hashMap.equals(hashMap2)) {
                return true;
            }
        }
        return false;
    }
}