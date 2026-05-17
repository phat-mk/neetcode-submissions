class MinStack {

    private Deque<Integer> main_stack;
    private Deque<Integer> min_stack;

    public MinStack() {
        main_stack = new ArrayDeque<>();
        min_stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        main_stack.push(val);
        if (min_stack.isEmpty() || val <= min_stack.peek()) min_stack.push(val);
    }
    
    public void pop() {
        int top = main_stack.pop();
        if (top == min_stack.peek()) min_stack.pop();
    }
    
    public int top() {
        return main_stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}