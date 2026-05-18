class MinStack {

    public Stack<Integer> stack;
    public PriorityQueue<Integer> queue;

    public MinStack() {
        this.stack = new Stack<>();
        this.queue = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        queue.add(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            int ele = stack.pop();
            queue.remove(ele);
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        return queue.peek();
    }
}