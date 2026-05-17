class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String str: strs) {
            stringBuilder.append(str.length());
            stringBuilder.append('#');
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    // 4#neet4#code4#love3#you
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            j++;
            String actualContent = str.substring(j, j+length);
            result.add(actualContent);
            i = j + length;
        }
        return result;
    }
}