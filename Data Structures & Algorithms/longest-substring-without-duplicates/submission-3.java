class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxSubString = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (hashMap.containsKey(c)) {
                left = Math.max(left, hashMap.get(c) + 1);
            }
            hashMap.put(c, right);
            maxSubString = Math.max(maxSubString, right - left + 1);
        }
        return maxSubString;
    }
}