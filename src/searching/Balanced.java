package searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {
        System.out.println(isBalanced("()([{)]}{((]))[}]"));
        System.out.println(isBalanced("()([{)]}{((]))[}](())(())(()()()()([{{{]]]]}}}]][[][]"));
        System.out.println(isBalanced("()(())((()))(((())))((((()))))[[]][[[]]]{}{[[]]}"));
        System.out.println(isBalanced("()[]{}"));
        System.out.println(isBalanced("]]]][[[["));
    }

    public static boolean isBalanced(String stringToCheck) {
        Map<Character, Character> TOKENS = new HashMap<Character, Character>();
        TOKENS.put('[', ']');
        TOKENS.put('{', '}');
        TOKENS.put('(', ')');

        Stack<Character> stack = new Stack<Character>();

        for(char currentCharacter : stringToCheck.toCharArray()) {
            if(TOKENS.keySet().contains(currentCharacter)) {
                stack.push(currentCharacter);
            } else if(TOKENS.values().contains(currentCharacter)) {
                if(!stack.empty() && TOKENS.get(stack.pop()) == currentCharacter) {
                    //stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
