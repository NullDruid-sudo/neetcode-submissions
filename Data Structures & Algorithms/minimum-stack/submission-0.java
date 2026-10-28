class MinStack {
    List<Integer> stack = new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        if(stack.size() == 0){
            return;
        }
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return Collections.min(stack);   
    }
}
