package strivers.stack;

import java.util.Stack;

public class ValidParanthesis{
    static boolean checkIfValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(ch == ']' && stack.peek() == '[' ||
                        ch == '}' && stack.peek() == '{' ||
                        ch == ')' && stack.peek() == '('){
                            stack.pop();
                }
                else{
                    return false;
                }
                    
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[()]{}";
        System.out.println(checkIfValid(str));
    }
}