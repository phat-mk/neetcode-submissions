class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i = 0; i < n; i++) {
            HashMap<Character, Boolean> hashMap = new HashMap<>();
            for(int j = i; j < n; j++) {
                if(hashMap.containsKey(s.charAt(j))){
                    break;
                }
                hashMap.put(s.charAt(j), true);
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
