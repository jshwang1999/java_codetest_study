package problems.ch9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {

    public static void main(String[] args) {
        String input1 = "([{}])";  // 유효한 괄호
        String input2 = "([)]";    // 유효하지 않은 괄호


        System.out.println("첫 번째 input: " + input1);
        System.out.println("두 번째 input: " + input2);
        System.out.println("Input 1 is valid: " + isValid(input1));
        System.out.println("Input 2 is valid: " + isValid(input2));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> bracketMap = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> stack = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            if (bracketMap.containsKey(ch)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMap.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}

