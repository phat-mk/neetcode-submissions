class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (c == ')' && stack.peek() != null && stack.poll() == '(' ) {
                continue;
            } else if (c == '}' && stack.peek() != null && stack.poll() == '{') {
                continue;
            } else if (c == ']' && stack.peek() != null && stack.poll() == '[') {
                continue;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}