package Homework4;

import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        String s = "()[[";
        System.out.print(isValid(s));
    }
    public static boolean isValid (String s) {
        Stack<Character> stack= new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(')
                stack.push(')');
            else if(ch=='{')
                stack.push('}');
            else if(ch=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=ch)
                return false;
        }
        return stack.isEmpty();
    }
}
