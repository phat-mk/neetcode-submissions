class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while(right < n) {
            char c = s.charAt(right);
            if (hashMap.containsKey(c)) {
                left = Math.max(left, hashMap.get(c) + 1);
            }
            hashMap.put(c, right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}