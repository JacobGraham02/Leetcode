package com.jacobdgraham.leetcode.Easy;

import java.util.Stack;

public class ValidParenthesis {
        
    public boolean isValid(String s) {
        Stack<Character> validParenthesisStack = new Stack<Character>();
        char inputBrackets[] = s.toCharArray();
            
        for (char c : inputBrackets) {
            switch (c) {
                case '(':
                    validParenthesisStack.push(')');
                    break;
                case '[':
                    validParenthesisStack.push(']');
                    break;
                case '{':
                    validParenthesisStack.push('}');
                    break;
                default:
                    if (validParenthesisStack.empty() || validParenthesisStack.pop() != c) {
                        return false;
                    }
            }
        }
        return validParenthesisStack.empty();
    }
}
