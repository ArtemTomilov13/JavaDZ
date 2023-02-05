package Homework4;

import java.util.Stack;
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
public class Task3 {
    public static void main(String[] args) {
        String s = "(){}[]";
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
