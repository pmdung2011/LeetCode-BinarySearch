import java.util.Stack;

public class BalancedBracket {
    public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        for(char c : expression.toCharArray()){
            switch(c){
                case '(': s.push(')');break;
                case '[': s.push(']');break;
                case '{': s.push('}');break;
                default:
                    if(s.empty() || s.pop() != c) return false;
            }
        }
        return s.empty();
    }
}
