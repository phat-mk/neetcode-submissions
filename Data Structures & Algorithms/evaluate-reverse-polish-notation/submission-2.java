class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str: tokens) {
            switch (str) {
                case "+":
                    int secondNum1 = stack.pop();
                    int firstNum1 = stack.pop();
                    int sum = firstNum1 + secondNum1;
                    stack.push(sum);
                    break;
                
                case "-":
                    int secondNum2 = stack.pop();
                    int firstNum2 = stack.pop();
                    int diff = firstNum2 - secondNum2;
                    stack.push(diff);
                    break;
                case "*":
                    int secondNum3 = stack.pop();
                    int firstNum3 = stack.pop();
                    int product = firstNum3 * secondNum3;
                    stack.push(product);
                    break;
                
                case "/":
                    int secondNum4 = stack.pop();
                    int firstNum4 = stack.pop();
                    if(secondNum4 != 0) {
                        int quotient = firstNum4 / secondNum4;
                        stack.push(quotient);
                    }
                    break;
                default:
                    int ele = Integer.parseInt(str);
                    stack.push(ele);
                    break;
            }
        }
        return stack.peek();
    }
}




