package HackerRank;

import java.util.*;

//You are given a list of strings ops where each element is either:
//        A non-negative integer that should be pushed into a stack
//        "POP" meaning pop the top element in the stack
//        "DUP" meaning duplicate the top element in the stack
//        "+" meaning pop the top two and push the sum
//        "-" meaning pop the top two and push top - second
//        Return the top element in the stack after applying all operations. If there are any invalid operations, return -1.
public class WordMachine {
    public static int solve(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "POP" -> {
                    if (stack.isEmpty())
                        return -1;
                    stack.pop();
                }
                case "DUP" -> {
                    if (stack.isEmpty())
                        return -1;
                    stack.push(stack.peek());
                }
                case "+" -> {
                    if (stack.size() < 2)
                        return -1;
                    stack.push(stack.pop() + stack.pop());
                }
                case "-" -> {
                    if (stack.size() < 2)
                        return -1;
                    stack.push(stack.pop() - stack.pop());
                }
                default -> stack.push(Integer.parseInt(op));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] ops = {"+"};
        System.out.println(solve(ops));
    }
}
