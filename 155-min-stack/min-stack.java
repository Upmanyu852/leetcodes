import java.util.Stack;
class MinStack {
    Stack<Integer> Stack;
    Stack<Integer> minStack;

    public MinStack() {
        Stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        Stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(Stack.isEmpty()) return;
        if(minStack.peek().equals(Stack.peek())){
            minStack.pop();
        }
        Stack.pop();
    }
    
    public int top() {
        return Stack.peek();

    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */