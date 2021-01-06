package HackerRank;

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
//            for (int i = 0; i < s.length(); i++) {
//                c = s.charAt(i);
//                if (c == ')' || c == ']' || c == '}') {
//                    if (stack.isEmpty() ||  stack.peek() !=  map.get(c)) {
//                        return false;
//                    } else {
//                        stack.pop();
//                    }
//                } else {
//                    stack.push(c);
//                }
//            }

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
}
