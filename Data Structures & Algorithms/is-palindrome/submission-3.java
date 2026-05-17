class Solution {
    public boolean isPalindrome(String s) {
        String normalized_str = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(normalized_str);
        int str_len = normalized_str.length();
        int j = str_len - 1;
        for (int i = 0; i < str_len; i++) {
            if (i == j){
                return true;
            }
            if (Character.toLowerCase(normalized_str.charAt(i)) != Character.toLowerCase(normalized_str.charAt(j))) {
                return false;
            } else {
                j--;
                continue;
            }
        }
        return true;
    }
}