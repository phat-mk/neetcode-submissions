class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s: tokens){
            // System.out.println(s);
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            } else {
                if (stack.isEmpty() || stack.size() < 2) continue;
                int second_ele = stack.pop();
                int first_ele = stack.pop();
                switch (s) {
                    case "+":
                       stack.push(first_ele + second_ele);
                       break;
                    case "-":
                       stack.push(first_ele - second_ele);
                       break;
                    case "*":
                       stack.push(first_ele * second_ele);
                       break;
                    case "/":
                       stack.push(first_ele / second_ele);
                       break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + s);
                }
            }
        }

        return stack.pop();
    }
}