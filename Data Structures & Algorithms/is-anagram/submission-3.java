class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstChars = s.toCharArray();
        Arrays.sort(firstChars);
        String s1 = new String(firstChars);
        char[] secondChars = t.toCharArray();
        Arrays.sort(secondChars);
        String s2 = new String(secondChars);
        return s1.equals(s2);
    }
}