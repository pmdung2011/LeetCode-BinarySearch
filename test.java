import java.util.*;

public class test {
    public static boolean solve(String s){
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            switch(c){
                case '(': stk.push(')');break;
                case '{': stk.push('}'); break;
                case '[': stk.push(']'); break;
                default:
                    if((stk.isEmpty() || stk.pop() != c)) return false;
            }

        }
        return stk.isEmpty();

    }

    public static void main(String[] args) {
        String s  = "(){)[]";
        System.out.println(solve(s));
    }
}
