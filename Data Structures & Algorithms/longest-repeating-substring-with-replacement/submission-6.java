class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int n = s.length();
        int left = 0;
        int maxFreq = 0;
        int[] count = new int[26];
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            count[c - 'A']++;
            maxFreq = Math.max(maxFreq, count[c - 'A']);
            while((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}