class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char a:s.toCharArray()){
            if(a == '{' || a == '(' || a == '['){
                stack.push(a);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char g = stack.pop();
                if( (g == '{' && a == '}') || (g == '[' && a == ']') || (g == '(' && a == ')' )){
                    continue;
                }
                return false;
            }
        
        
    }
    
return stack.isEmpty();
}}
