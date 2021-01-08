

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        } else {
//            char c;
            HashMap<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');

            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray() ) {
                if(map.containsKey(c)){
                    if(stack.isEmpty() || map.get(c) != stack.pop()){
                        return false;
                    }
                }
                else{
                    stack.push(c);
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        String s = "()()((";
        System.out.println(isValid(s));
    }
}
