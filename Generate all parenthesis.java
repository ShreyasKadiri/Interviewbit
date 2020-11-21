public class Solution {
    public int isValid(String A) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : A.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                return 0;
            }
            
            }
            return stack.isEmpty()==true ? 1 : 0;
    }
}
